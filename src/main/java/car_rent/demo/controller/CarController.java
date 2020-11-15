package car_rent.demo.controller;

import car_rent.demo.dto.CarDto;
import car_rent.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CarController {

@Autowired
    private CarService carService;

@RequestMapping(value = "/car", method = RequestMethod.GET)
    public String carList(Model model) {
    List<CarDto> dtos = carService.getAll();
    model.addAttribute("carList", dtos);
    return "carList";
}

@RequestMapping(value = "/car/add", method = RequestMethod.GET)
    public String carCeate (Model model) {
    CarDto car = new CarDto();
    model.addAttribute("car", car);
    return "carCreate";
}
//tworzenie car i powrot do listy samochodow
    @RequestMapping(value = "/car/add", method = RequestMethod.POST)
    public String carCeate (@ModelAttribute("car") CarDto carDto) {

    carService.createCar(carDto);
        return "redirect:/car";
    }
}
