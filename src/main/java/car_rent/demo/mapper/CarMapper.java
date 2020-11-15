package car_rent.demo.mapper;

import car_rent.demo.dto.CarRentalDto;
import car_rent.demo.entity.CarEntity;

public class CarMapper {

    public static CarRentalDto mapEntityToDto(CarEntity entity){
        CarRentalDto dto = new CarRentalDto();
        dto.setCarBrand(entity.getCarBrand());
        dto.setStatus(entity.getStatus());
        dto.setPerDayCost(entity.getPerDayCost());
        return dto;
    }
}
