//skopiowane z www
package car_rent.demo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class User {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birtdate;


}