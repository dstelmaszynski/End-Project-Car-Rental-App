package car_rent.demo.mapper;

import car_rent.demo.dto.CarDto;
import car_rent.demo.dto.ReservationDto;
import car_rent.demo.entity.CarEntity;
import car_rent.demo.entity.ReservationEntity;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ReservationMapper {
    public static ReservationDto mapResToDto(ReservationEntity entity){
        ReservationDto dto = new ReservationDto();
       dto.setReservationCost(entity.getReservationCost());
       dto.setReservationCreateDate(entity.getReservationCreateDate());
       dto.setReservationDateStart(entity.getReservationDateStart());
       dto.setReservationDateEnd(entity.getReservationDateEnd());
       dto.setClientId(entity.getClientId());
       dto.setCarId(entity.getCarId());


        return dto;
    }
    public static List<ReservationDto> mapResListToDtoList (Iterable<ReservationEntity> entities) {

        List<ReservationDto> dtos = new ArrayList<>();

        for (ReservationEntity entity:entities) {
            dtos.add(mapResToDto(entity));

        }
        return dtos;
    }
    public static ReservationEntity mapDtoToRes(ReservationDto dto) throws ParseException {

        ReservationEntity entity = new ReservationEntity();
        entity.setReservationCost(dto.getReservationCost());
        entity.setReservationCreateDate(dto.getReservationCreateDate());
        entity.setReservationDateStart(dto.getReservationDateStart());
        entity.setReservationDateEnd(dto.getReservationDateEnd());
        entity.setClientId(dto.getClientId());
        entity.setCarId(dto.getCarId());

        return entity;
    }
}
