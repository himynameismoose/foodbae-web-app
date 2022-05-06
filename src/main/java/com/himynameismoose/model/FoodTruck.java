package com.himynameismoose.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * This class will represent each Food Truck in San Francisco.
 */

public class FoodTruck {

    // Details of a Food Truck
    private int id;
    private String name;
    private String address;
    private String food;

    public FoodTruck() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
