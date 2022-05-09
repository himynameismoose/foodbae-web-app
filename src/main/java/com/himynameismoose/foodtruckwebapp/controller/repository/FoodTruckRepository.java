package com.himynameismoose.foodtruckwebapp.controller.repository;

import com.himynameismoose.foodtruckwebapp.model.FoodTruck;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This interface will use JPA to generate code for CRUD operations
 *
 * @author mershellerivera
 * version 1.0
 */

public interface FoodTruckRepository extends JpaRepository<FoodTruck, Integer> {
    // All CRUD methods
}
