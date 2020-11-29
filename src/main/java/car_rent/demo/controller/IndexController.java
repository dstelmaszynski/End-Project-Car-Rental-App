//skopiowane z www

package car_rent.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping({ "/index" })
public class IndexController {


    @GetMapping
    public String main() {

        return "index";
    }


    @PostMapping
    public String save() {

        return "reservationCreate";
    }
}
