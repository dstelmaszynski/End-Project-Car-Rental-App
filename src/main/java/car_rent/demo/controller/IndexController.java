//skopiowane z www

package car_rent.demo.controller;

import car_rent.demo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping({ "/", "/index" })
public class IndexController {

    @GetMapping
    public String main(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping
    public String save(User user, Model model) {
        model.addAttribute("user", user);
        return "saved";
    }
}