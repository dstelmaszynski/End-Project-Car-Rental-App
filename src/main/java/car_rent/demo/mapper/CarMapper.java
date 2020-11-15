package car_rent.demo.mapper;
import car_rent.demo.dto.CarRentalDto;
import car_rent.demo.entity.CarEntity;
import java.util.ArrayList;
import java.util.List;


//mapowanie obiektu Car do dto
public class CarMapper {

    public static CarRentalDto mapEntityToDto(CarEntity entity){
        CarRentalDto dto = new CarRentalDto();
        dto.setCarBrand(entity.getCarBrand());
        dto.setStatus(entity.getStatus());
        dto.setPerDayCost(entity.getPerDayCost());
        return dto;
    }

    //mapowanie listy do dto
    public static List<CarRentalDto> mapEntityListToDtoList (Iterable<CarEntity> entities) {

        List<CarRentalDto> dtos = new ArrayList<>();

        for (CarEntity entity:entities) {
            dtos.add(mapEntityToDto(entity));

        }
        return dtos;
    }
}
