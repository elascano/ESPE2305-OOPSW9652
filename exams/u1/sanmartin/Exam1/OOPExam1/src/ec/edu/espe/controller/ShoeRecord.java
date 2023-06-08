
package ec.edu.espe.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.model.Shoe;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class ShoeRecord {
   
     Scanner sc = new Scanner(System.in);
     List<Shoe> shoes = new ArrayList<>();
    
     public void record(){        
         System.out.println("Write a ID: ");
         int id = sc.nextInt();
         System.out.println("Write a Brand: ");
         String brand = sc.next();
         System.out.println("Write a Size: ");
         int size = sc.nextInt();
         Shoe shoe = new Shoe(id, brand, size);             
         shoes.add(shoe);
         saveShoeToJson(shoes, "shoes.json");
         
    
     }
    
     public static void saveShoeToJson(List<Shoe> shoes, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(shoes, writer);
            System.out.println("Students saved to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
     public static  void printAllObjects(List<Shoe> shoes) {
        for (Shoe shoe : shoes) {
            System.out.println("ID: " + shoe.getId());
            System.out.println("Brand: " + shoe.getBrand());
            System.out.println("Size: " + shoe.getSize());
            System.out.println("-------------");
        }
    }
     
    public void print(){
        printAllObjects(shoes);
    }
}
