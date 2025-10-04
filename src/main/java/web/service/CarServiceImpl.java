package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Service
public class CarServiceImpl implements CarService {
    private final Car[]  cars;
    public CarServiceImpl() {
        cars = new Car[5];
        cars[0] = new Car("BMW", 3, 300);
        cars[1] = new Car("BMW", 4, 400);
        cars[2] = new Car("Mercedes", 11, 150);
        cars[3] = new Car("Запорожец", 965, 100);
        cars[4] = new Car("Lada", 2181, 120);
    }

    public List<Car> getCars(Integer number) {
        Stream<Car> carStream = Arrays.stream(cars);
        if (number != null && number < 5) {
            carStream = carStream.limit(number);
        }
        return carStream.toList();
    }
}
