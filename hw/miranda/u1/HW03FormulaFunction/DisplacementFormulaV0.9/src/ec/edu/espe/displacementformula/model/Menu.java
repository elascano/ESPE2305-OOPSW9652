package ec.edu.espe.displacementformula.model;

import ec.edu.espe.displacementformula.view.CSVGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private static List<Position> positions = new ArrayList<>();
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
                    Position position = new Position();
                    position.readData();
                    positions.add(position);
                    System.out.println("Data inserted");
                    break;
                case 2:
                    if (positions.isEmpty()) {
                        System.out.println("Insert data first");
                    } else {
                        for (Position pos : positions) {
                            float displacement = DisplacementCalculator.calculateDisplacement(pos.getInitialPosition(), pos.getFinalPosition());
                            System.out.println("The displacement from the initial position " + pos.getInitialPosition() + "m to the final position " + pos.getFinalPosition() + "m is: " + displacement + " meters");
                        }
                    }
                    break;
                case 3:
                    if (positions.isEmpty()) {
                        System.out.println("Insert data first");
                    } else {
                        CSVGenerator.generateCSV(positions, "displacement_data.csv");
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
