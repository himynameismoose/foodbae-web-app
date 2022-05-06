package com.himynameismoose.model;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadCSV {

    private static final String CSV_FILE =
            "src/main/resources/San Francisco Food Trucks - Mobile_Food_Facility_Permit.csv";

    public static void main(String[] args) {
        readAllData(CSV_FILE);
    }

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
