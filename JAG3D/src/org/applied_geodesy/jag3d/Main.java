package org.applied_geodesy.jag3d;

import java.io.File;
import java.io.IOException;
import org.applied_geodesy.adjustment.network.NetworkAdjustment;
import org.applied_geodesy.jag3d.ui.io.reader.CSVPointFileReader;
import org.applied_geodesy.jag3d.ui.io.reader.CSVObservationFileReader;
import org.applied_geodesy.jag3d.ui.metadata.MetaData;



public class Main {
    public static void main(String[] args) {
        try {
            // Step 1: Create a new project with its metadata
            MetaData metaData = new MetaData();
            metaData.setProjectName("Your Project Name");
            metaData.setDescription("Project Description");
            metaData.setAuthor("Author Name");
            // Add other metadata as needed
            // Save metadata to file (optional)
            metaData.saveToFile(new File("metadata.xml"));

            // Step 2: Import the Points and measurements
            CSVPointFileReader pointReader = new CSVPointFileReader();
            pointReader.read(new File("path/to/points.csv"));

            CSVObservationFileReader observationReader = new CSVObservationFileReader();
            observationReader.read(new File("path/to/observations.csv"));

            // Step 3: Start the Network Adjustment
            NetworkAdjustment adjustment = new NetworkAdjustment();
            adjustment.setMetaData(metaData);
            adjustment.setPoints(pointReader.getPoints());
            adjustment.setObservations(observationReader.getObservations());
            adjustment.performAdjustment();

            // Output the results
            adjustment.saveResults(new File("results.xml"));
            System.out.println("Network adjustment completed successfully.");

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("An error occurred during file reading.");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("An error occurred during network adjustment.");
        }
    }
}

