package car_rent.demo;

import car_rent.demo.entity.CarEntity;
import car_rent.demo.entity.ClientEntity;
import car_rent.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ClientDataLoader implements ApplicationRunner {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        ClientEntity entity = new ClientEntity();
        entity.setClientVorname("Adam");
        entity.setClientSurname("Nowak");
        entity.setClientAddress("ul.Nowowiejskiego 16, 61-038 Poznań,");
        entity.setClientEmail("a_nowak@wp.pl");

        clientRepository.save(entity);

        ClientEntity entity2 = new ClientEntity();
        entity.setClientVorname("Patrycja");
        entity.setClientSurname("Jarząbek");
        entity.setClientAddress("ul.Marcinkowskiego 25, 61-015 Poznań,");
        entity.setClientEmail("pj@o2.pl");

        clientRepository.save(entity2);

        ClientEntity entity3 = new ClientEntity();
        entity.setClientVorname("Wiesław");
        entity.setClientSurname("Dobrejmyśli");
        entity.setClientAddress("ul.Podgórna 2, 61-002 Poznań,");
        entity.setClientEmail("dobramysl@wp.pl");

        clientRepository.save(entity3);
    }

}
