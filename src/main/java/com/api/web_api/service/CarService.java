package com.api.web_api.service;

import com.api.web_api.model.Car;
import com.api.web_api.repository.CarRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Data
@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public Iterable<Car> getAllCar(){
        return carRepository.findAll();
    }

    public Car saveCar(Car newCar){
        return this.carRepository.save(newCar);
    }

    public Car getCarById(Long id){
        return this.carRepository.findById(id).orElse(null);
    }

    public void deleteCarById(Long id){
        this.carRepository.deleteById(id);
    }
    public Iterable<Car> getCarByBrand(String brand){
        return this.carRepository.findByBrand(brand);
    }
    public Iterable<Car> getCarByYears(int year){
        return this.carRepository.findByYears(year);
    }
}
