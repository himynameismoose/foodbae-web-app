package com.himynameismoose.foodtruckwebapp;

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
public class FoodTruckWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodTruckWebAppApplication.class, args);
	}
}
