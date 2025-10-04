package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Controller
public class CarController {
    @Autowired
    private CarServiceImpl carService;

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(required = false) Integer number, ModelMap model) {
        List<Car> carList = carService.getCars(number);
        model.addAttribute("cars", carList);
        return "cars";
    }
}
