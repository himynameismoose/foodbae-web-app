package com.himynameismoose.foodbaewebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is the starting point of the application
 *
 * @author mershellerivera
 * @version 1.0
 */
@SpringBootApplication
@RestController
public class FoodbaeWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodbaeWebAppApplication.class, args);
	}
}
