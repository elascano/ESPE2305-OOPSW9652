package ec.edu.espe.vehicle.view;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import static ec.edu.espe.vehicle.controller.FileManage.read;
import static ec.edu.espe.vehicle.controller.FileManage.save;
import ec.edu.espe.vehicle.model.Vehicle;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class VehicleData {
    public static void main(String[] args, ArrayList<Vehicle> actualVehicleData, ArrayList<Vehicle> actualvehiclesData) {
        int option = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehicle> actualVehiclesData = new ArrayList<>();
        int idToSearch;
        
        do {
            actualvehiclesData = read(actualVehiclesData, "Vehicles.json");
            System.out.println("\n\t-----Welcome Vehicle Menu-----");
            System.out.println("1. Enter Vehicle");
            System.out.println("2. Edit Vehicle");
            System.out.println("3. Delete Vehicle");
            System.out.println("4. Find Vehicle");
            System.out.println("5. Exit");
            System.out.print("\n\tEnter an option: ");
            switch (option) {
                case 1:
                    addVehicle(actualVehicleData);
                    save(actualVehicleData, "Vehicle.jason");
                    
                    break;

                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("......");
                    break;
                default:
                    System.out.println("Opcion invalida, intente de nuevo: ");
            }
        }while (option !=5);
    }
    
    public static void addVehicle(ArrayList<Vehicle> vehicles) {

        Scanner sc = new Scanner(System.in);
        Vehicle vehicle;
        int id;
        String name;
        String model;

        try {
            System.out.print("Enter the id of the Vehicle: ");
            id = sc.nextInt();
            
            sc.nextLine();
            System.out.print("Enter the name of the Vehicle: ");
            name = sc.nextLine();

            System.out.print("Enter the model of Vehicle: ");
            model = sc.nextLine();

            vehicle = new Vehicle(id, name, model);
            
            vehicles.add(vehicle);
        } catch (Exception e) {
            System.out.println(" INVALID DATA, PLEASE INSERT AGAIN ");
        }
    }
}