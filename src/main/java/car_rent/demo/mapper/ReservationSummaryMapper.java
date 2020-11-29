package car_rent.demo.mapper;

import car_rent.demo.dto.CarDto;
import car_rent.demo.dto.ClientDto;
import car_rent.demo.dto.ReservationDto;
import car_rent.demo.dto.ReservationSummaryDto;
import car_rent.demo.entity.ReservationEntity;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;



public class ReservationSummaryMapper {

    public static ReservationSummaryDto mapResSumToDto(ReservationEntity entity) {
        ReservationSummaryDto dto = new ReservationSummaryDto();
        dto.setReservationCost(entity.getReservationCost());
        dto.setReservationCreateDate(new SimpleDateFormat("yyyy-MM-dd").format(entity.getReservationCreateDate()));
        dto.setReservationDateStart(new SimpleDateFormat("yyyy-MM-dd").format(entity.getReservationDateStart()));
        dto.setReservationDateEnd(new SimpleDateFormat("yyyy-MM-dd").format(entity.getReservationDateEnd()));

        CarDto car = CarMapper.mapEntityToDto(entity.getCar());
        dto.setCar(car);

        ClientDto client = ClientMapper.mapClientToDto(entity.getClient());
        dto.setClient(client);

        return dto;
    }

    public static List<ReservationSummaryDto> mapResSumListToDtoList(Iterable<ReservationEntity> entities) {

        List<ReservationSummaryDto> dtos = new ArrayList<>();

        for (ReservationEntity entity : entities) {
            dtos.add(mapResSumToDto(entity));

        }
        return dtos;
    }
}
