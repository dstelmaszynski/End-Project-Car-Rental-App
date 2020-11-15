package car_rent.demo.repository;

import car_rent.demo.entity.CarEntity;
import car_rent.demo.entity.ReservationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<ReservationEntity, Integer> {


    ReservationEntity getByReservationId(Integer id);

}
