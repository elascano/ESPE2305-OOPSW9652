package ec.edu.espe.chickenfarm.controller;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class RegisterChicken {
    public Chicken registerChicken(){
        Scanner readData = new Scanner(System.in);
        System.out.print("Id: ");
        int id = readData.nextInt();
        System.out.print("Name: ");
        String name = readData.next();
        System.out.print("Color: ");
        String color = readData.next();
        System.out.print("Is Molting: ");
        boolean isMolting = readData.nextBoolean();
        System.out.print("Year Born: ");
        int yearBorn = readData.nextInt();
        System.out.print("Month Born: ");
        int monthBorn = readData.nextInt();
        System.out.print("Day Born: ");
        int dayBorn = readData.nextInt();
        Chicken chicken = new Chicken(id, name, color, isMolting,new Date(yearBorn, monthBorn, dayBorn));
        return chicken;
    }
}
