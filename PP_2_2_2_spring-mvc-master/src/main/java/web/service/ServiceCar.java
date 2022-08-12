package web.service;
import web.model.Car;
import java.util.List;

public interface ServiceCar {

    List<Car> getCarlist(int ncar);
}