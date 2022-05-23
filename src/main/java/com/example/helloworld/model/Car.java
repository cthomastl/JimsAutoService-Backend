package com.example.helloworld.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private long id;
    private String make;
    private String model;
    private String issue;
    private int year;


    public Car(long id, String make, String model, String issue) {
    }
}
