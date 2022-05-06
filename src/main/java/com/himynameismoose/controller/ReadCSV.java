package com.himynameismoose.controller;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * This class is to take in .csv file to be read
 *
 * @author mershellerivera
 * @version 1.0
 */
public class ReadCSV {

    // this is the .csv file that will be used as data
    private static final String CSV_FILE =
            "src/main/resources/San Francisco Food Trucks - Mobile_Food_Facility_Permit.csv";

    public static void main(String[] args) {
        readAllData(CSV_FILE);
    }

    // this method reads the file line by line
    public static void readDataByLine(String file) {
        try {
            FileReader fr = new FileReader(file);
            CSVReader csvReader = new CSVReader(fr);
            String[] nextRecord;

            while ((nextRecord = csvReader.readNext()) != null) {
                for (String cell : nextRecord) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        } catch (CsvValidationException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    // this method will read all data in file
    public static void readAllData(String file) {
        try {
            FileReader fr = new FileReader(file);
            CSVReader csvReader = new CSVReaderBuilder(fr)
                    .withSkipLines(1)
                    .build();

            List<String[]> allData = csvReader.readAll();

            for (String[] row : allData) {
                for (String cell : row) {
                    System.out.print(cell + "\t");
                }

                System.out.println();
            }
        } catch (IOException | CsvException e) {
            throw new RuntimeException(e);
        }
    }
}
