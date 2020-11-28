//skopiowane z www

package car_rent.demo.controller;

import car_rent.demo.User;
import car_rent.demo.dto.CarDto;
import car_rent.demo.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
@RequestMapping({ "/index" })
public class IndexController {


    @GetMapping
    public String main(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }


    @PostMapping
    public String save(User user, Model model) {
        model.addAttribute("user", user);
        return "reservationCreate";
    }
}
