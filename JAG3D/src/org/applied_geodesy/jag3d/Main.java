package org.applied_geodesy.jag3d;

import org.applied_geodesy.jag3d.ui.metadata.MetaData;



public class Main {
    public static void main(String Projectname, String ProjectDescription, String AuthorName, String PointsPath, String ObservationsPath, String ResultsPath,
            String CustomerID, String ProjectID) {
        try {
            // Step 1: Create a new project with its metadatasr 
            MetaData metaData = new MetaData();
            metaData.setName(Projectname);
            metaData.setDescription(ProjectDescription);
            metaData.setOperator(AuthorName);
            metaData.setCustomerId(CustomerID);
            metaData.setProjectId(ProjectID);
    
            // Add other metadata as needed
            // Save metadata to file (optional)
            //metaData.saveToFile(new File("metadata.xml"));
            //Set Path in DefaultFileChooser.java

            // Step 2: Import the Points and measurements
        //     CSVPointFileReader pointReader = new CSVPointFileReader();
        //     pointReader.read(new File("path/to/points.csv"));

        //     CSVObservationFileReader observationReader = new CSVObservationFileReader();
        //     observationReader.read(new File("path/to/observations.csv"));

        //     // Step 3: Start the Network Adjustment
        //     NetworkAdjustment adjustment = new NetworkAdjustment();
        //     adjustment.setMetaData(metaData);
        //     adjustment.setPoints(pointReader.getPoints());
        //     adjustment.setObservations(observationReader.getObservations());
        //     adjustment.performAdjustment();

        //     // Output the results
        //     adjustment.saveResults(new File("results.xml"));
        //     System.out.println("Network adjustment completed successfully.");

        // } catch (IOException e) {
        //     e.printStackTrace();
        //     System.err.println("An error occurred during file reading.");
        // } catch (Exception e) {
        //     e.printStackTrace();
        //     System.err.println("An error occurred during network adjustment.");
        
        } catch (Exception e) {
            System.out.println("Hello Laurenz!");
            MetaData metaData = new MetaData();
            metaData.setName("Projectname");}
    }
}

