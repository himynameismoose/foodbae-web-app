package com.himynameismoose.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class will represent each Food Truck in San Francisco.
 */
@Entity
@Table(name = "FoodTruck")
public class FoodTruck {

    // Details of Food Truck
    @Id
    private int id;
    private String name;
    private String address;
    private String food;

    public FoodTruck() {
    }

    public int getId() {
        return id;
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
