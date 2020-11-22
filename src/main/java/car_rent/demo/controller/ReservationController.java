package car_rent.demo.controller;


import car_rent.demo.dto.CarDto;
import car_rent.demo.dto.ReservationDto;
import car_rent.demo.service.CarService;
import car_rent.demo.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ReservationController {
    @Autowired
    private ReservationService reservationService;
    @Autowired
    private CarService carService;

    @RequestMapping(value = "/reservation", method = RequestMethod.GET)
    public String reservationList(Model model) {
        List<ReservationDto> dtos = reservationService.getAll();
        model.addAttribute("reservationList", dtos);
        return "reservationList";
    }
    @RequestMapping(value = "/reservation/add", method = RequestMethod.GET)
    //request param podajesz pola do przesyłu http
    public String reservationCreate (Model model, @RequestParam String startDate, @RequestParam String endDate) {
       ReservationDto reservation = new ReservationDto();
       //zdefiniowanie tych pól, setery na pobranie z http
       reservation.setReservationDateStart(startDate);
       reservation.setReservationDateEnd(endDate);
        List<CarDto> dtos = carService.getAll();
       model.addAttribute("reservation", reservation);
       model.addAttribute("carList", dtos);

        return "reservationCreate";
}


    @RequestMapping(value = "/reservation/add", method = RequestMethod.POST)
    public String reservationCreate (@ModelAttribute("reservation") ReservationDto reservationDto) {

        reservationService.createReservation(reservationDto);
        return "redirect:/reservation";
    }


}
