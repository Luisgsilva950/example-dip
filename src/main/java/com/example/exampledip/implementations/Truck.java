package com.example.exampledip.implementations;

import com.example.exampledip.interfaces.Vehicle;

public class Truck implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a truck...");
    }
}
