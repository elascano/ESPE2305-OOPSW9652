package ec.edu.espe.displacementformula.view;

import ec.edu.espe.displacementformula.model.Position;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVGenerator {

    public static void generateCSV(List<Position> positions, String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            
            writer.append("Order,initialPosition,finalPosition,Displacement\n");

            int order = 1;
            for (Position position : positions) {
                float initialPosition = position.getInitialPosition();
                float finalPosition = position.getFinalPosition();
                float displacement = finalPosition - initialPosition;

                writer.append(order + "," + initialPosition + "," + finalPosition + "," + displacement + "\n");
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

