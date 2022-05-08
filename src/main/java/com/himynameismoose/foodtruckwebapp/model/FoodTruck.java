package com.himynameismoose.foodtruckwebapp.model;

import javax.persistence.*;

/**
 * This class will represent each Food Truck in San Francisco.
 *
 * @author mershellerivera
 * @version 1.0
 */
@Entity
@Table(name = "foodtrucks")
public class FoodTruck {

    // Details of Food Truck
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "food")
    private String food;

    public FoodTruck() {
    }

    public FoodTruck(int id, String name, String address, String food) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.food = food;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
