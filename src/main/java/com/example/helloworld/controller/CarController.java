package com.example.helloworld.controller;

import com.example.helloworld.model.Car;
import com.example.helloworld.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class CarController {

   @Autowired
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }
@PostMapping("/cars")
public Car createdCar (@RequestBody Car car) {
return carService.createdCar(car);
}

@GetMapping("/cars")
    public List<Car>getAllCars() {
        return carService.getAllCars();
    }
}


