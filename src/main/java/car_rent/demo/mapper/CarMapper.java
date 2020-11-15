package car_rent.demo.mapper;
import car_rent.demo.dto.CarDto;
import car_rent.demo.entity.CarEntity;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;


//mapowanie obiektu Car do dto
public class CarMapper {

    public static CarDto mapEntityToDto(CarEntity entity){
        CarDto dto = new CarDto();
        dto.setCarBrand(entity.getCarBrand());
        dto.setStatus(entity.getStatus());
        dto.setPerDayCost(entity.getPerDayCost());
        dto.setCarColor(entity.getCarColor());
        dto.setCarMileage(entity.getCarMileage());
        dto.setCarModel(entity.getCarModel());
        dto.setCarProductionYear(entity.getCarProductionYear());
        dto.setCarType(entity.getCarType());
        return dto;
    }

    //mapowanie listy do dto
    public static List<CarDto> mapEntityListToDtoList (Iterable<CarEntity> entities) {

        List<CarDto> dtos = new ArrayList<>();

        for (CarEntity entity:entities) {
            dtos.add(mapEntityToDto(entity));

        }
        return dtos;
    }
    //mapowanie z dto do entity
    public static CarEntity mapDtoToEntity(CarDto dto) throws ParseException {

        CarEntity entity = new CarEntity();
        entity.setCarBrand(dto.getCarBrand());
        entity.setPerDayCost(dto.getPerDayCost());
        entity.setStatus(dto.getStatus());
        entity.setCarColor(dto.getCarColor());
        entity.setCarMileage(dto.getCarMileage());
        entity.setCarModel(dto.getCarModel());
        entity.setCarProductionYear(dto.getCarProductionYear());
        entity.setCarType(dto.getCarType());
        return entity;
    }
}
