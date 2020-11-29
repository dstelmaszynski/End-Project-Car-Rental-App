package car_rent.demo.service;

import car_rent.demo.dto.ReservationDto;
import car_rent.demo.dto.ReservationSummaryDto;
import car_rent.demo.entity.CarEntity;
import car_rent.demo.entity.ClientEntity;
import car_rent.demo.entity.ReservationEntity;
import car_rent.demo.mapper.CarMapper;
import car_rent.demo.mapper.ClientMapper;
import car_rent.demo.mapper.ReservationMapper;
import car_rent.demo.mapper.ReservationSummaryMapper;
import car_rent.demo.repository.CarRepository;
import car_rent.demo.repository.ClientRepository;
import car_rent.demo.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private ClientRepository clientRepository;

    public List<ReservationDto> getAll(){
        Iterable<ReservationEntity> entities = reservationRepository.findAll();
        List<ReservationDto> dtos = ReservationMapper.mapResListToDtoList(entities);

        return dtos;
    }

    public List<ReservationSummaryDto> getAllSum(){
        Iterable<ReservationEntity> entities = reservationRepository.findAll();
        List<ReservationSummaryDto> dtos = ReservationSummaryMapper.mapResSumListToDtoList(entities);

        return dtos;
    }


    public ReservationDto createReservation(ReservationDto dto) {
        try {
            CarEntity car = carRepository.getById(dto.getCarId());

            //klasa wyciągająca username
            String username;
            Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal(); //user details
            if (principal instanceof UserDetails){
                username = ((UserDetails)principal).getUsername();
            } else{
                username = principal.toString();
            }

            ClientEntity client = clientRepository.findByUsername(username);

            ReservationEntity entity = ReservationMapper.mapDtoToRes(dto);
            entity.setCar(car);
            entity.setClient(client);

            Instant instantStartDate = entity.getReservationDateStart().toInstant();
            Instant instantEndDate = entity.getReservationDateEnd().toInstant();

            long daysBetween = DAYS.between(instantStartDate,instantEndDate);
            long result = daysBetween*entity.getCar().getPerDayCost();
            entity.setReservationCost((int) result);



            //dodanie nowej daty
            entity.setReservationCreateDate(new Date());
            entity = reservationRepository.save(entity);
            return  ReservationMapper.mapResToDto(entity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public ReservationDto getById(Integer id) {
        ReservationEntity entity = reservationRepository.getByReservationId(id);
        return ReservationMapper.mapResToDto(entity);
    }

    public ReservationSummaryDto getByReservationId(Integer reservationId) {

        ReservationEntity reservationEntity = reservationRepository.getByReservationId(reservationId);

        ReservationSummaryDto result = new ReservationSummaryDto();
        result.setReservationCreateDate(new SimpleDateFormat("yyyy-MM-dd").format(reservationEntity.getReservationCreateDate()));
        result.setReservationDateStart(new SimpleDateFormat("yyyy-MM-dd").format(reservationEntity.getReservationDateStart()));
        result.setReservationDateEnd(new SimpleDateFormat("yyyy-MM-dd").format(reservationEntity.getReservationDateEnd()));
        result.setReservationCost(reservationEntity.getReservationCost());
        result.setCar(CarMapper.mapEntityToDto(reservationEntity.getCar()));
        result.setClient(ClientMapper.mapClientToDto(reservationEntity.getClient()));

        return result;
    }
}
