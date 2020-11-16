package car_rent.demo;

import car_rent.demo.entity.CarEntity;
import car_rent.demo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CarDataLoader implements ApplicationRunner {

    @Autowired
    private CarRepository carRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception{

        CarEntity entity = new CarEntity();
        entity.setCarBrand("Skoda");
        entity.setCarModel("Octavia");
        entity.setCarType("Kombi");
        entity.setCarProductionYear("2010");
        entity.setCarColor("Srebrny");
        entity.setCarMileage(72000);
        entity.setStatus("wolny");
        entity.setPerDayCost(450);

        carRepository.save(entity);

        CarEntity entity2 = new CarEntity();
        entity.setCarBrand("Mercedes");
        entity.setCarModel("Klasa E");
        entity.setCarType("Sedan");
        entity.setCarProductionYear("2019");
        entity.setCarColor("Czarny");
        entity.setCarMileage(50000);
        entity.setStatus("wolny");
        entity.setPerDayCost(990);

        carRepository.save(entity2);

        CarEntity entity3 = new CarEntity();
        entity.setCarBrand("Ford");
        entity.setCarModel("S-Max");
        entity.setCarType("Van");
        entity.setCarProductionYear("2019");
        entity.setCarColor("Biały");
        entity.setCarMileage(66000);
        entity.setStatus("wolny");
        entity.setPerDayCost(680);

        carRepository.save(entity3);
    }
}
//TODO dodaje tylko jeden samochód na stronie
