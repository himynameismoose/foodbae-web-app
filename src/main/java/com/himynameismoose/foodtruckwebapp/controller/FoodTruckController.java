package com.himynameismoose.foodtruckwebapp.controller;

import com.himynameismoose.foodtruckwebapp.controller.repository.FoodTruckRepository;
import com.himynameismoose.foodtruckwebapp.exceptions.ResourceNotFoundException;
import com.himynameismoose.foodtruckwebapp.model.FoodTruck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    // get food truck by id REST API
    @GetMapping("{id}")
    public ResponseEntity<FoodTruck> getFoodTruckByID(@PathVariable int id) {
        FoodTruck foodtruck = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Food Truck not found"));

        return ResponseEntity.ok(foodtruck);
    }

    // update food truck REST API
    @PutMapping("{id}")
    public ResponseEntity<FoodTruck> updateFoodTruck(@PathVariable int id, @RequestBody FoodTruck foodtruckDetails) {
        FoodTruck updateFoodTruck = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Food Truck not found"));

        updateFoodTruck.setName(foodtruckDetails.getName());
        updateFoodTruck.setAddress(foodtruckDetails.getAddress());
        updateFoodTruck.setFood(foodtruckDetails.getFood());

        repository.save(updateFoodTruck);

        return ResponseEntity.ok(updateFoodTruck);
    }

    // delete food truck REST API
    @DeleteMapping("{id}")
    public ResponseEntity<FoodTruck> deleteFoodTruck(@PathVariable int id) {
        FoodTruck foodtruck = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Food Truck not found"));

        repository.delete(foodtruck);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}