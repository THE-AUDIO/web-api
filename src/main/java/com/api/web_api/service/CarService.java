package com.api.web_api.service;

import com.api.web_api.model.Car;
import com.api.web_api.repository.CarRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public Iterable<Car> getAllCar(){
        return carRepository.findAll();
    }
}
