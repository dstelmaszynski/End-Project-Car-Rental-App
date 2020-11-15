package car_rent.demo.repository;


import car_rent.demo.entity.CarEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<CarEntity, Integer> {


    CarEntity getById(Integer id);
}
