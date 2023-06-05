package ec.edu.espe.weightformula.view;

import ec.edu.espe.weightformula.model.Weight;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;



public class CSVGenerator {

    public static void generateCSV(List <Weight> weights, String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            
            writer.append("Order,mass,gravity\n");

            int order = 1;
            for (Weight weight : weights) {
                float mass = weight.getMass();
                float gravity = weight.getGravity();
                

                writer.append(order + "," + mass + "," + gravity + "\n");
                order++;
            }

            writer.flush();
            writer.close();

            System.out.println(".csv generated: " + filename);
        } catch (IOException e) {
            System.out.println("Error generating .csv file: " + e.getMessage());
        }
    }
}

