package ec.edu.edpe.accelerationformula.model;

import ec.edu.edpe.accelerationformula.model.Data;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class CSVGenerator {

    public static void main() {
        Scanner dataRead = new Scanner(System.in);
        ArrayList<Data> list = dataList(dataRead);
        File save = new File("./acceleration.csv");
        try (FileWriter text = new FileWriter(save);) {
            
            for (Data data : list) {
                text.write(data.toCSV() + "\n");
            }
        } catch (Exception error) {
            System.out.println("An error has occurred");
        }
    }

    public static ArrayList<Data> dataList(Scanner dataRead) {
        ArrayList<Data> list = new ArrayList<Data>();
        float initialVelocity;
        float finalVelocity;
        float time;
        float acceleration;
        Data data;

        do {
            System.out.println("Enter initial speed value: ");
            initialVelocity =dataRead.nextFloat();
            if (initialVelocity >= 0) {
                System.out.println("Enter initial final value: ");
                finalVelocity = dataRead.nextFloat();
                System.out.println("Enter time value: ");
                time = dataRead.nextFloat();
                acceleration = (finalVelocity - initialVelocity) / time;
                System.out.println("The acceleration is: " + acceleration);
            data= new Data(initialVelocity,finalVelocity,time,acceleration);
            list.add(data);
            }
            
        } while (initialVelocity < 0);
        return list;
    }
}
