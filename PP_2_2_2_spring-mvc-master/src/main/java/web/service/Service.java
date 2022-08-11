package web.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Component
public class Service {
  static List<Car> carlist = Arrays.asList(
           new Car("Yo", "petrol", "red"),
        new Car("Yo1", "diesel", "black"),
        new Car("Yo2", "el", "green"),
        new Car("Yo3", "petrol", "orange"),
        new Car("Yo4", "diesel", "brown"));


    public static List<Car> getCarlist( String ncar) {
        switch (ncar) {
            case "2":
                return carlist.subList(0, 2);
            case "3":
                return carlist.subList(0, 3);
            case "4":
                return carlist.subList(0, 4);
           /* case "null":
                return carlist;*/
            default:
                return carlist;
        }
    }
}
