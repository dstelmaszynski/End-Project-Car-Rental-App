package car_rent.demo.service;



//tworzene listy samochodow i tworzenie samochodow

import car_rent.demo.dto.CarDto;
import car_rent.demo.entity.CarEntity;
import car_rent.demo.mapper.CarMapper;
import car_rent.demo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<CarDto> getAll(){
        Iterable<CarEntity> entities = carRepository.findAll();
        List<CarDto> dtos = CarMapper.mapEntityListToDtoList(entities);

        return dtos;
    }

    public CarDto createCar(CarDto dto) {
        try {
            CarEntity entity = CarMapper.mapDtoToEntity(dto);

            entity = carRepository.save(entity);
            return  CarMapper.mapEntityToDto(entity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public CarDto getById(Integer id) {
        CarEntity entity = carRepository.getById(id);
        return CarMapper.mapEntityToDto(entity);
}}
