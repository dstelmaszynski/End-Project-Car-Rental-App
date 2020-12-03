package car_rent.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    @Qualifier("customUserDetailsService")
    private UserDetailsService userDetailsService;

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);

        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(passwordEncoder());

        auth.authenticationProvider(authProvider);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/","/login")
                .hasAnyRole("ADMIN", "MODERATOR")
                .antMatchers("/index","/reservation/**","/car/**","/client/**")
                .hasAnyRole("ADMIN", "MODERATOR")
                .antMatchers("/index","/reservation/**","/car/**","/client/**")
                .hasAnyRole("ADMIN")
                .and()

                //konfiguracja do loginu --> początek
                .formLogin()
                .permitAll()
//                .loginPage("/login")
//                .defaultSuccessUrl("/index")
//                    //złe hasło i login --> failureHandler
//                    .failureUrl("/fail_log")

                //konfiguracja do loginu --> koniec
                .and()
                .logout().permitAll()
                .and()
                .headers().frameOptions().disable()
                .and().csrf().disable();

    }


}
