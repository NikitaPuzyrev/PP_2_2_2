package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.Service;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    Service service;
    List<Car> list;

    public CarController(Service service) {
        this.service = service;
    }

    @GetMapping()
    String getCar(Model model, @RequestParam(value = "count", required = false) Integer count) {

        if (count != null) list = service.getCarlist(count);
        else {
            list = service.getCarlist(10);
        }
        model.addAttribute("car", list);
        return "car";
    }
}


