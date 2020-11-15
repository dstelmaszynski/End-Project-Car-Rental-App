package car_rent.demo.controller;


import car_rent.demo.dto.ReservationDto;
import car_rent.demo.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @RequestMapping(value = "/reservation", method = RequestMethod.GET)
    public String reservationList(Model model) {
        List<ReservationDto> dtos = reservationService.getAll();
        model.addAttribute("reservationList", dtos);
        return "reservationList";
    }
    @RequestMapping(value = "/reservation/add", method = RequestMethod.GET)
    public String reservationCreate (Model model) {
       ReservationDto reservation = new ReservationDto();
        model.addAttribute("reservation", reservation);
        return "reservationCreate";
}
    @RequestMapping(value = "/reservation/add", method = RequestMethod.POST)
    public String reservationCreate (@ModelAttribute("reservation") ReservationDto reservationDto) {

        reservationService.createReservation(reservationDto);
        return "redirect:/reservation";
    }
}