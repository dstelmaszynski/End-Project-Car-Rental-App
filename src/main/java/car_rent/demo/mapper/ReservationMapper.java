package car_rent.demo.mapper;

import car_rent.demo.dto.CarDto;
import car_rent.demo.dto.ReservationDto;
import car_rent.demo.entity.CarEntity;
import car_rent.demo.entity.ReservationEntity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ReservationMapper {
    public static ReservationDto mapResToDto(ReservationEntity entity) {
        ReservationDto dto = new ReservationDto();
        dto.setId(entity.getReservationId());
        dto.setReservationCost(entity.getReservationCost());
        dto.setReservationCreateDate(new SimpleDateFormat("yyyy-MM-dd").format(entity.getReservationCreateDate()));
        //pattern musi być dd-MM-yyyy, szczególnie chodzi o MM, muszą być z dużych liter inaczej nie będzie działać
//       dto.setReservationCreateDate(entity.getReservationCreateDate());

        dto.setReservationDateStart(new SimpleDateFormat("yyyy-MM-dd").format(entity.getReservationDateStart()));
//        dto.setReservationDateStart(entity.getReservationDateStart());

        dto.setReservationDateEnd(new SimpleDateFormat("yyyy-MM-dd").format(entity.getReservationDateEnd()));
//        dto.setReservationDateEnd(entity.getReservationDateEnd());
//        dto.setClientId(entity.get());



        return dto;
    }

    public static List<ReservationDto> mapResListToDtoList(Iterable<ReservationEntity> entities) {

        List<ReservationDto> dtos = new ArrayList<>();

        for (ReservationEntity entity : entities) {
            dtos.add(mapResToDto(entity));

        }
        return dtos;
    }

    public static ReservationEntity mapDtoToRes(ReservationDto dto) throws ParseException {

        ReservationEntity entity = new ReservationEntity();
        entity.setReservationCost(dto.getReservationCost());

        if (dto.getReservationCreateDate() != null) {
            entity.setReservationCreateDate(new SimpleDateFormat("yyyy-MM-dd").parse(dto.getReservationCreateDate()));
        }
        //pattern musi być dd-MM-yyyy, szczególnie chodzi o MM, muszą być z dużych liter inaczej nie będzie działać
//        entity.setReservationCreateDate(dto.getReservationCreateDate());

        entity.setReservationDateStart(new SimpleDateFormat("yyyy-MM-dd").parse(dto.getReservationDateStart()));
//        entity.setReservationDateStart(dto.getReservationDateStart());

        entity.setReservationDateEnd(new SimpleDateFormat("yyyy-MM-dd").parse(dto.getReservationDateEnd()));
//        entity.setReservationDateEnd(dto.getReservationDateEnd());
//        entity.setClientId(dto.getClientId());

        return entity;
    }
}

// TODO spróbować opisać różne znaki w dacie i w przypadku pustego pola żeby nie wyrzucał błędu