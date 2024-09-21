package com.api.web_api.controler;

import com.api.web_api.model.Car;
import com.api.web_api.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GarageControler {
    @Autowired
    private CarService CarService;

    @GetMapping("/all")
    public Iterable<Car> allCar() {
        return CarService.getAllCar();
    }
    @PostMapping("/save")
    public Car createCar(@RequestBody Car newCar) {
        return CarService.saveCar(newCar);
    }
}
