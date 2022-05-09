package com.himynameismoose.foodtruckwebapp;

import com.himynameismoose.foodtruckwebapp.controller.repository.FoodTruckRepository;
import com.himynameismoose.foodtruckwebapp.model.FoodTruck;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * This is the starting point of the application.
 * Tomcat will host Spring Boot web app.
 *
 * @author mershellerivera
 * @version 1.0
 */
@SpringBootApplication
public class FoodTruckWebAppApplication implements CommandLineRunner {

	public final String CSVFile = "src/main/resources/San Francisco Food Trucks - Mobile_Food_Facility_Permit.csv";
	public static void main(String[] args) {
		SpringApplication.run(FoodTruckWebAppApplication.class, args);
	}

	@Autowired
	private FoodTruckRepository repository;

	// this method will build the database using the .csv file
	public void buildDB(String file) {

		try {
			FileReader fr = new FileReader(file);
			CSVReader csvReader = new CSVReaderBuilder(fr)
					.withSkipLines(1)
					.build();

			List<String[]> allData = csvReader.readAll();

			for (String[] row : allData) {

				String name = row[0];
				String address = row[2];
				String food = row[4];

				FoodTruck foodtruck = new FoodTruck();
				foodtruck.setName(name);
				foodtruck.setAddress(address);

				repository.save(foodtruck);
			}
		} catch (IOException | CsvException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void run(String... args) throws Exception {

		buildDB(CSVFile);
	}
}
