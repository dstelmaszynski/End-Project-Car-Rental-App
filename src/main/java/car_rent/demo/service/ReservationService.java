package car_rent.demo.service;

import car_rent.demo.dto.CarDto;
import car_rent.demo.dto.ReservationDto;
import car_rent.demo.entity.CarEntity;
import car_rent.demo.entity.ReservationEntity;
import car_rent.demo.mapper.CarMapper;
import car_rent.demo.mapper.ReservationMapper;
import car_rent.demo.repository.CarRepository;
import car_rent.demo.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    public List<ReservationDto> getAll(){
        Iterable<ReservationEntity> entities = reservationRepository.findAll();
        List<ReservationDto> dtos = ReservationMapper.mapResListToDtoList(entities);

        return dtos;
    }

    public ReservationDto createReservation(ReservationDto dto) {
        try {
            ReservationEntity entity = ReservationMapper.mapDtoToRes(dto);

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
    }}
