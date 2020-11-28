package car_rent.demo.service;

import car_rent.demo.dto.ReservationDto;
import car_rent.demo.dto.ReservationSummaryDto;
import car_rent.demo.entity.CarEntity;
import car_rent.demo.entity.ReservationEntity;
import car_rent.demo.mapper.CarMapper;
import car_rent.demo.mapper.ClientMapper;
import car_rent.demo.mapper.ReservationMapper;
import car_rent.demo.repository.CarRepository;
import car_rent.demo.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private CarRepository carRepository;

    public List<ReservationDto> getAll(){
        Iterable<ReservationEntity> entities = reservationRepository.findAll();
        List<ReservationDto> dtos = ReservationMapper.mapResListToDtoList(entities);

        return dtos;
    }

    public ReservationDto createReservation(ReservationDto dto) {
        try {
            CarEntity car = carRepository.getById(dto.getCarId());

            ReservationEntity entity = ReservationMapper.mapDtoToRes(dto);
            entity.setCar(car);

            // TODO: oblicz koszt rezerwacji

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
