package com.himynameismoose.foodtruckwebapp.controller;

import com.himynameismoose.foodtruckwebapp.controller.repository.FoodTruckRepository;
import com.himynameismoose.foodtruckwebapp.model.FoodTruck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This class controls the application
 *
 * @author mershellerivera
 * @version 1.0
 */
@CrossOrigin(origins = "http://localhost:3000") // connects to React
@RestController
@RequestMapping("/foodtrucks")
public class FoodTruckController {

    @Autowired
    private FoodTruckRepository repository;

    // Get all food trucks
    @GetMapping("/allfoodtrucks")
    public List<FoodTruck> getAllFoodTrucks() {
        return repository.findAll();
    }
    
}