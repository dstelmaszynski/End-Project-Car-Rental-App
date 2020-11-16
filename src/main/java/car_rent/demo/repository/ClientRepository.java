package car_rent.demo.repository;

import car_rent.demo.entity.ClientEntity;
import car_rent.demo.entity.ReservationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity,Integer> {

    ClientEntity getByClientId(Integer id);
}
