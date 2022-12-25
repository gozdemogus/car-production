package com.example.demo.Controller;


import com.example.demo.Cabrio;
import com.example.demo.Car;
import com.example.demo.Hatchback;
import com.example.demo.Sedan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @GetMapping("/produceCar")
    public String produceCar(@RequestParam("type") String type) {
        Car car = null;
        if (type.equalsIgnoreCase("cabrio")) {
            car = new Cabrio();
        } else if (type.equalsIgnoreCase("sedan")) {
            car = new Sedan();
        } else if (type.equalsIgnoreCase("hatchback")) {
            car = new Hatchback();
        }
        if (car == null) {
            return "Invalid car type";
        }
        return car.getType() + " car has been produced.";
    }
}