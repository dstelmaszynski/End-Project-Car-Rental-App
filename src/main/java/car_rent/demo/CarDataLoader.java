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
        entity2.setCarBrand("Mercedes");
        entity2.setCarModel("Klasa E");
        entity2.setCarType("Sedan");
        entity2.setCarProductionYear("2019");
        entity2.setCarColor("Czarny");
        entity2.setCarMileage(50000);
        entity2.setStatus("wolny");
        entity2.setPerDayCost(990);

        carRepository.save(entity2);

        CarEntity entity3 = new CarEntity();
        entity3.setCarBrand("Ford");
        entity3.setCarModel("S-Max");
        entity3.setCarType("Van");
        entity3.setCarProductionYear("2019");
        entity3.setCarColor("Biały");
        entity3.setCarMileage(66000);
        entity3.setStatus("wolny");
        entity3.setPerDayCost(680);

        carRepository.save(entity3);
    }
}
