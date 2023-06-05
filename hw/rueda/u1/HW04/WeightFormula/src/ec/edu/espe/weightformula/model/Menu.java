package ec.edu.espe.weightformula.model;

import ec.edu.espe.weightformula.view.CSVGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private static List<Weight> weights = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void showMenu() {
        int option;
        
        do {
            System.out.println("MENU:");
            System.out.println("1. Insert Data");
            System.out.println("2. Read Data");
            System.out.println("3. Generate CSV");
            System.out.println("4. Exit");
            System.out.print("Enter the desired option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    Weight weight = new Weight();
                    weight.readData();
                    weights.add(weight);
                    System.out.println("-Data inserted-");
                    break;
                case 2:
                    if (weights.isEmpty()) {
                        System.out.println("Insert data mass");
                    } else {
                        for (Weight wei : weights) {
                            
                            float weightis = WeightCalculator.calculateWeight(wei.getMass(), wei.getGravity());
                            System.out.println("the weight of the mass " + wei.getMass() + " kg multiplied by gravity is" + wei.getGravity() + "m/s2 is: " + weightis + " Newtons");
                        }
                    }
                    break;
                case 3:
                    if (weights.isEmpty()) {
                        System.out.println("Insert data first");
                    } else {
                        CSVGenerator.generateCSV(weights, "weight_data.csv");
                    }
                    break;
                case 4:
                    System.out.println("Successfully exited");
                    break;
                default:
                    System.out.println("Invalid option. Enter again: ");
                    break;
            }
        } while (option != 4);
    }

}
