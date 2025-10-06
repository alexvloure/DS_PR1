package edu.uoc.ds.adt.util;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CSVReader {

    public static CSVParser getCVSParser(String filePath) {
        try {
            return CSVFormat.DEFAULT.builder()
                    .setHeader()
                    .setSkipHeaderRecord(true)
                    .build()
                    .parse(Files.newBufferedReader(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to read the CSV file: " + filePath);
        }
    }
}
