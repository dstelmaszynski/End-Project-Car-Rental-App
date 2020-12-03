package car_rent.demo;

import car_rent.demo.entity.ClientEntity;
import car_rent.demo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


@Component
public class ClientDataLoader implements ApplicationRunner {
    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        ClientEntity entity = new ClientEntity();
        entity.setUsername("Test1");
        entity.setPassword(passwordEncoder.encode("test1"));
        entity.setClientVorname("Adam");
        entity.setClientSurname("Nowak");
        entity.setClientAddress("ul.Nowowiejskiego 16, 61-038 Poznań");
        entity.setClientEmail("a_nowak@wp.pl");

        //dodane do deniniowania roli
        User.builder().roles("ADMIN");

        clientRepository.save(entity);

        ClientEntity entity2 = new ClientEntity();
        entity2.setUsername("Test2");
        entity2.setPassword(passwordEncoder.encode("test2"));
        entity2.setClientVorname("Patrycja");
        entity2.setClientSurname("Jarząbek");
        entity2.setClientAddress("ul.Marcinkowskiego 25, 61-015 Poznań");
        entity2.setClientEmail("pj@o2.pl");

//        User.builder().roles("MODERATOR");

        clientRepository.save(entity2);

        ClientEntity entity3 = new ClientEntity();
        entity3.setUsername("Test3");
        entity3.setPassword(passwordEncoder.encode("test3"));
        entity3.setClientVorname("Wiesław");
        entity3.setClientSurname("Dobrejmyśli");
        entity3.setClientAddress("ul.Podgórna 2, 61-002 Poznań");
        entity3.setClientEmail("dobramysl@wp.pl");

//        User.builder().roles("MODERATOR");

        clientRepository.save(entity3);
    }

}
