package com.himynameismoose.foodtruckwebapp;

import com.himynameismoose.foodtruckwebapp.controller.repository.FoodTruckRepository;
import com.himynameismoose.foodtruckwebapp.model.FoodTruck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This is the starting point of the application.
 * Tomcat will host Spring Boot web app.
 *
 * @author mershellerivera
 * @version 1.0
 */
@SpringBootApplication
public class FoodTruckWebAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FoodTruckWebAppApplication.class, args);
	}

	@Autowired
	private FoodTruckRepository repository;

	@Override
	public void run(String... args) throws Exception {
		FoodTruck foodtruck = new FoodTruck();
		foodtruck.setName("Taco Truck");
		foodtruck.setAddress("100 ave");
		foodtruck.setFood("Tacos");
		repository.save(foodtruck);
	}
}
