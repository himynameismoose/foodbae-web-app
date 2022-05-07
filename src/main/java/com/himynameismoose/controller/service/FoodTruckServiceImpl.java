package com.himynameismoose.controller.service;

import com.himynameismoose.model.FoodTruck;
import com.himynameismoose.model.repository.FoodTruckRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * This class implements the FoodTruckService interface
 */
public class FoodTruckServiceImpl implements FoodTruckService {

    @Autowired
    private FoodTruckRepository ftRepo;

    @Override
    public FoodTruck saveFoodTruck(FoodTruck foodTruck) {
        return ftRepo.save(foodTruck);
    }
}
