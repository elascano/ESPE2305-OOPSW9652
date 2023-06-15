
package ec.edu.espe.HardwareStore.controller;

import ec.edu.espe.HardwareStore.model.Hammer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class HammerData {
     public static Hammer registerHammer(){
        Scanner readProduct = new Scanner(System.in);
        
        System.out.print("Id:");
        String id = readProduct.nextLine();
        System.out.print("Name: ");
        String name = readProduct.nextLine();
        System.out.print("Brand: ");
        String brand = readProduct.nextLine();
        System.out.print("Cost (##,#):");
        float cost = readProduct.nextFloat();
        while(cost<=-1){
            System.out.println("No negative");
            System.out.print("Cost:");
            cost = readProduct.nextFloat();
        }
        Hammer hammer = new Hammer(id, name, brand, cost);
        return hammer;
    }
}
