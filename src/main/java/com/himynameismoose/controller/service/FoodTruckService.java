package com.himynameismoose.controller.service;

import com.himynameismoose.model.FoodTruck;
import com.himynameismoose.model.repository.FoodTruckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * This class is to use FoodTruckRepository interface.
 * Uses @Transactional annotation to use and execute all methods.
 *
 * @author mershellerivera
 * @version 1.0
 */
@Service
@Transactional
public class FoodTruckService {

    @Autowired
    private FoodTruckRepository ftrepo;

    public List<FoodTruck> listAll() {
        return ftrepo.findAll();
    }

    public void save(FoodTruck foodtruck) {
        ftrepo.save(foodtruck);
    }

    public FoodTruck get(int id) {
        return (FoodTruck) ftrepo.findById(id).get();
    }

    public void delete(int id) {
        ftrepo.deleteById(id);
    }
}
