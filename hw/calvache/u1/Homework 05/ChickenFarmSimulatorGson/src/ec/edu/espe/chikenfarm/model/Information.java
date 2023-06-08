package ec.edu.espe.chikenfarm.model;

import ec.edu.espe.chikenfarm.model.Chicken;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class Information {

    public Chicken iformationChicken() {
        
        Scanner readData = new Scanner(System.in);
        System.out.print("Insert the Chicken Id: ");
        int id = readData.nextInt();
        
        System.out.print("Insert the Chicken Name: ");
        String name = readData.next();
        
        System.out.print("Insert the Chicken Color: ");
        String color = readData.next();
        System.out.print("The Chciken is Molting?--> ");
        
        boolean isMolting = readData.nextBoolean();
        System.out.print("Insert the year when the Chicken born: ");
        
        int yearBorn = readData.nextInt();
        System.out.print("Insert the month when the Chicken born: ");
        
        int monthBorn = readData.nextInt();
        System.out.print("Insert the day when the Chicken born: ");
        
        int dayBorn = readData.nextInt();
        Chicken chicken = new Chicken(id, name, color, isMolting, new Date(yearBorn, monthBorn, dayBorn));
        
        return chicken;
    }
}
