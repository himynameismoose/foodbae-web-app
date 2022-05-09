package com.himynameismoose.foodtruckwebapp.controller;

import com.himynameismoose.foodtruckwebapp.controller.repository.FoodTruckRepository;
import com.himynameismoose.foodtruckwebapp.model.FoodTruck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This class controls the application
 *
 * @author mershellerivera
 * @version 1.0
 */
@CrossOrigin("*") // connects to React
@RestController
@RequestMapping("/api/v1/foodtrucks")
public class FoodTruckController {

    @Autowired
    private FoodTruckRepository repository;

    // Get all food trucks
    @GetMapping
    public List<FoodTruck> getAllFoodTrucks() {
        return repository.findAll();
    }

    // create food truck REST API
    @PostMapping
    public FoodTruck createFoodTruck(@RequestBody FoodTruck foodtruck) {
        return repository.save(foodtruck);
    }
}