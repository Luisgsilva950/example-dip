package com.example.exampledip.implementations;

import com.example.exampledip.interfaces.Vehicle;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car...");
    }
}
