package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.Arrays;
import java.util.List;

@Component
public class Service implements ServiceCar {
    List<Car> carlist = Arrays.asList(
            new Car("Yo", "petrol", "red"),
            new Car("Yo1", "diesel", "black"),
            new Car("Yo2", "el", "green"),
            new Car("Yo3", "petrol", "orange"),
            new Car("Yo4", "diesel", "brown"));

    @Override
    public List<Car> getCarlist(int ncar) {
        if (ncar < 5 && ncar > 1) {
            return carlist.subList(1, ncar + 1);
        } else {
            return carlist;
        }
    }
}

