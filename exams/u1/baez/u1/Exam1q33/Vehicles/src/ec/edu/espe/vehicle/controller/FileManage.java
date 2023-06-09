package ec.edu.espe.vehicle.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import ec.edu.espe.vehicle.model.Vehicle;
import java.io.*;
import java.util.*;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class FileManage {
    public static ArrayList<Vehicle> read(ArrayList<Vehicle> vehicles, String fileName) {
        String fromJson = "";
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = "";
            while ((line = br.readLine()) != null) {
                fromJson = line;
                TypeToken<ArrayList<Vehicle>> type = new TypeToken<ArrayList<Vehicle>>() {
                };
                vehicles = gson.fromJson(fromJson, type.getType());
            }
            br.close();
        } catch (FileNotFoundException ex) {
            System.out.println("*** THE FILE DOESN'T EXIST, IT WILL BE CREATED ***");
        } catch (IOException ex) {
            System.out.println("*** THE FILE CAN'T BE READED ***");
        }
        return vehicles;
    }
    
    public static void save(ArrayList<Vehicle> vehicles, String fileName) {
        Gson gson = new Gson();
        String json = gson.toJson(vehicles);

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(json);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }
    
    public static int find(ArrayList<Vehicle> vehicles, int id, String fileName){
       Vehicle galaxyIterated = new Vehicle();

        for (int i = 0; i < vehicles.size(); i++) {
            galaxyIterated = vehicles.get(i);
    }
        return 0;

    }
    public static void delete(ArrayList<Vehicle> vehicles, int vehicleFoundPosition) {
        int idToSearch;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("..:: Insert the id of the Galaxy to delete: ");
            idToSearch = sc.nextInt();

            int galaxyFoundPosition = find(vehicles, idToSearch, "Vehicles.json");

            if (galaxyFoundPosition != -1) {
                
                vehicles.remove(vehicleFoundPosition);
                save(vehicles, "Vehicles.json");
                System.out.println("\n\n VEHICLE DELETED SUCCESSFULLY \n");
                
            } else {
                System.out.println("THE ID ENTERED DOESN'T EXIST");
            }
            
        } catch (Exception e) {
            System.out.println("THE VEHICLE DIDN'T CAN BE DELETED");
        }
    }


}