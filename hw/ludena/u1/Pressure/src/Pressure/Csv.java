
package Pressure;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Edison Ludeña, BugBuster, DCCO-ESPE
 */
public class Csv {
    
    public static void main(String[] args) {
        menu();
    }

    
    public static void createFile(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of the forse: ");
        float forse = scanner.nextFloat();

        System.out.print("Enter the area value: ");
        float area = scanner.nextFloat();

        float pressure = (float) forse / area;

        String nombreArchivo = "datos.csv";

        try {
            FileWriter archivo = new FileWriter(nombreArchivo);

            archivo.write("Forse,Area,Pressure 3\n");

            archivo.write(forse + "," + area + "," + pressure + "\n");

            archivo.close();

            System.out.println("The file has been successfully created in CSV format.");
        } catch (IOException e) {
            System.out.println("Error creating the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    
    public static void calculatePressure() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of the forse: ");
        float forse = scanner.nextFloat();

        System.out.print("Enter the area value: ");
        float area = scanner.nextFloat();

        float pressure = forse + area;
        System.out.println("The pressure is: " + pressure);
    }
    
    public static void menu(){
        Scanner scanner = new Scanner(System.in);

        int option = 0;

        do {
            System.out.println("----- Menú -----");
            System.out.println("1. Calculate Pressure");
            System.out.println("2. Create File");
            System.out.println("3. Exit");
            System.out.print("Enter an option: ");
            if (scanner.hasNextInt())
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    calculatePressure();
                    break;
                case 2:
                    createFile();
                    break;
                case 3:
                    System.out.println("Leaving the program...");
                    break;
                default:
                    System.out.println("Invalid option. Please enter a valid option.");
            }
        } while (option != 3);

        scanner.close();
    }

}
    
    
    


    


   
