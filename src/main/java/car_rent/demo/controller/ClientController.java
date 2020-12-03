package car_rent.demo.controller;

import car_rent.demo.dto.CarDto;
import car_rent.demo.dto.ClientDto;
import car_rent.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping({"/","/login"})
    public String login() {

        return "login";
    }



    @RequestMapping(value="/client", method = RequestMethod.GET)
    public String clientList(Model model){
        List<ClientDto> dtos = clientService.getAll();
        model.addAttribute("clientList",dtos);
        return "clientList";
    }

    @RequestMapping(value="/client/add", method = RequestMethod.GET)
    public String clientCreate (Model model){
        ClientDto client = new ClientDto();
        model.addAttribute("client",client);
        return "clientCreate";
    }

    @RequestMapping(value="/client/add",method = RequestMethod.POST)
    public String clientCreate(@ModelAttribute("client")ClientDto clientDto){
        clientService.createClient(clientDto);
        return "redirect:/client";
    }


}
