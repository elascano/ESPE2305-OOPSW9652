
package ec.edu.espe.chickenfarm.controller;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class EnterNewChicken {
    
    public Chicken EnterNewChicken(){

    Scanner readData = new Scanner(System.in);
    
        System.out.print("Id: ");
        
        int id = readData.nextInt();
        System.out.print("Enter Name: ");
        
        String name = readData.next();
        System.out.print("Enter Color: ");
        
        String color = readData.next();
        System.out.print("Is Molting: ");
        
        boolean isMolting = readData.nextBoolean();
        System.out.print("Enter Year of Born: ");
        
        int yearOfBorn = readData.nextInt();
        System.out.print("Enter Month of Born: ");
        
        int monthOfBorn = readData.nextInt();
        System.out.print("Enter Day of Born: ");
        
        int dayOfBorn = readData.nextInt();
        
        Chicken chicken = new Chicken(id, name, color, isMolting,new Date(yearOfBorn, monthOfBorn, dayOfBorn));
        return chicken;
}
    
}
