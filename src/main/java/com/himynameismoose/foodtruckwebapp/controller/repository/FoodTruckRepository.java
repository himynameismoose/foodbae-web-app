package com.himynameismoose.foodtruckwebapp.controller.repository;

import com.himynameismoose.foodtruckwebapp.model.FoodTruck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * This interface will use JPA to generate code for CRUD operations
 *
 * @author mershellerivera
 * version 1.0
 */
@Repository // collection of objects -> Data
public interface FoodTruckRepository extends JpaRepository<FoodTruck, Integer> {
}