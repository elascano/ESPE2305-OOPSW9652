/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;
 

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Oswaldo Tipan
 */
public class ChickenFarm {
    
    public static void main(String[] args){
        Coop coop;
        ArrayList<Chicken> chickens = new ArrayList<>();
        coop = new Coop(1, chickens);
        mainMenu(chickens, coop);
    }
    
    public static void mainMenu(ArrayList chickens, Coop coop){
        
        int opc = 0;
        int idCoop = 0;
        Scanner option = new Scanner(System.in);
                
        while(opc != 3){
            System.out.println("-----Chicken Farm Simulation-----\n");
            System.out.println("1. Add Chickens\n");
            System.out.println("2. See Chickens\n");
            System.out.println("3. Exit\n");
            System.out.println("Ingrese su opción: ");
            opc = option.nextInt();
            
            switch(opc){
                case 1:
                    idCoop++;
                    addChickens(chickens, idCoop);
                    break;
                case 2:
                    seeChickens(chickens, coop);
                    break;
                case 3:
                    opc = 3;
                    break;
                default:
                    System.out.println("Insert a valid option");
                    break;          
            }
        }
    }
    
    public static void seeChickens(ArrayList chickens, Coop coop){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();        
        String  jsonCoop = gson.toJson(coop);
        System.out.println(jsonCoop+"\n");
    }
    
    public static void addChickens(ArrayList chickens, int idCoop){
        Poop poop;
        Egg egg;
        Chicken chicken;
        Coop coop;
        
        int opc=1;
        int count=1;
        Scanner dataIn = new Scanner(System.in);
        
        while(opc!=2){
            
            String name;
            String color;
            Boolean isMolting;
            System.out.println("-----Insert Data-------");
            
            System.out.println("Insert the Chickens's name: ");
            name = dataIn.nextLine();
            
            System.out.println("Insert the Chicken's color: ");
            color = dataIn.nextLine();
            
            System.out.println("Insert if the Chicken es molting (true or false): ");
            isMolting = dataIn.nextBoolean();
            
            chicken = new Chicken(count, name, color, isMolting, new Date(10, 0, 1));
            poop = new Poop(chicken.getId());
            chickens.add(chicken);
            System.out.println("Chicken added\n\n");
            
            System.out.println("1. Insert another Chicken");
            System.out.println("2. Return");
            System.out.println("Insert you option: ");
            
            opc = dataIn.nextInt();

            switch(opc){
                case 1:
                    count++;
                    break;
                case 2: 
                    opc = 2;
                    break;
                default:
                    System.out.println("Insert a valid option");
                    break;
            }
        }
    }    
}
