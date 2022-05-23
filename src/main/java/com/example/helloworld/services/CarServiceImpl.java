package com.example.helloworld.services;

import com.example.helloworld.entity.CarEntity;
import com.example.helloworld.model.Car;
import com.example.helloworld.repository.CarRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService{

    private CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }


    @Override
    public List<Car> getAllCars() {
        List<CarEntity>carEntities
                = carRepository.findAll();

        List<Car>cars = carEntities
                .stream()
                .map(c -> new Car(c.getId()
                , c.getMake(),
                        c.getModel(),
                        c.getIssue(),
                        c.getYear()))
                .collect(Collectors.toList());

        return cars;
    }

    @Override
    public Car createdCar(Car car) {
        CarEntity carEntity = new CarEntity();

        BeanUtils.copyProperties(car, carEntity);
        carRepository.save(carEntity);
        return car;
    }


}
