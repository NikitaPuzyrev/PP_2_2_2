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
    @GetMapping()
    String getCar(Model model, @RequestParam(value = "count", required = false) String count) {

        List<Car> list;
        if (count != null){
            list = Service.getCarlist(count);
        } else{
            list = Service.getCarlist("count");
        }
        model.addAttribute("car", list);
        return "car";
    }
}


