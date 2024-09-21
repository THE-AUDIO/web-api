package com.api.web_api.controler;

import com.api.web_api.model.Car;
import com.api.web_api.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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

    @PostMapping("/search/{id}")
    public Car getCarById(@PathVariable Long id) {
        return CarService.getCarById(id);
    }

    @PostMapping("/search/{brand}")
    public Iterable<Car> getCarByBrand(@PathVariable String brand) {
        return CarService.getCarByBrand(brand);
    }

}
