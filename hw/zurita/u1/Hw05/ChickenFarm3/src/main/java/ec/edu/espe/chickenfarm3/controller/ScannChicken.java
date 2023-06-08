package ec.edu.espe.chickenfarm3.controller;

import ec.edu.espe.chickenfarm3.model.Chicken;
import java.util.Scanner;
import java.util.Date;

/**
 *
  * @author PabloEZurita
 */
public class ScannChicken {
    public Chicken registerChicken(){
        Scanner dataOfChickens = new Scanner(System.in);
        System.out.print("Id: ");
        int id = dataOfChickens.nextInt();
        System.out.print("Name: ");
        String name = dataOfChickens.next();
        System.out.print("Color: ");
        String color = dataOfChickens.next();
        System.out.print("Is Molting: ");
        boolean isMolting = dataOfChickens.nextBoolean();
        System.out.print("Year Born: ");
        int yearBorn = dataOfChickens.nextInt();
        System.out.print("Month Born: ");
        int monthBorn = dataOfChickens.nextInt();
        System.out.print("Day Born: ");
        int dayBorn = dataOfChickens.nextInt();
        Chicken chicken = new Chicken(id, name, color, isMolting,new Date(yearBorn, monthBorn, dayBorn));
        return chicken;
    }
}