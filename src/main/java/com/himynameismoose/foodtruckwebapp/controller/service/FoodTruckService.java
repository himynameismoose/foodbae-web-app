package com.himynameismoose.foodtruckwebapp.controller.service;

import com.himynameismoose.foodtruckwebapp.controller.repository.FoodTruckRepository;
import com.himynameismoose.foodtruckwebapp.model.FoodTruck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * This will use the repository used to implement methods of JPARepository.
 * Utilized CRUD methods for FoodTruck
 *
 * @author mershelle rivera
 * @version 1.0
 */
@Service
@Transactional
public class FoodTruckService {

    @Autowired
    private FoodTruckRepository repo;

    public List<FoodTruck> listAll() {
        return repo.findAll();
    }

    public void save(FoodTruck foodtruck) {
        repo.save(foodtruck);
    }

    public FoodTruck get(int id) {
        return (FoodTruck) repo.findById(id).get();
    }

    public void delete(int id) {
        repo.deleteById(id);
    }
}