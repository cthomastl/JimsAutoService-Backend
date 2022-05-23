package com.example.helloworld.services;

import com.example.helloworld.model.Car;

import java.util.List;

public interface CarService {


    List<Car> getAllCars();


     Car createdCar(Car car);


}
