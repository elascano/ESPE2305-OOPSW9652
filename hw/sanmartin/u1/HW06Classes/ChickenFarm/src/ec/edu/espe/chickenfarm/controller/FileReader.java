
package ec.edu.espe.chickenfarm.controller;

import ec.edu.espe.chickenfarm.model.Chicken;

import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class FileReader {
public Chicken readFile(){
    Scanner readFile = new Scanner(System.in);
        System.out.print("Id: ");
        int id = readFile.nextInt();
        System.out.print("Name: ");
        String name = readFile.next();
        System.out.print("Color: ");
        String color = readFile.next();
        System.out.print("Is Molting: ");
        boolean isMolting = readFile.nextBoolean();
        System.out.print("Year Born: ");
        int yearBorn = readFile.nextInt();
        System.out.print("Month Born: ");
        int monthBorn = readFile.nextInt();
        System.out.print("Day Born: ");
        int dayBorn = readFile.nextInt();
        Chicken chicken = new Chicken(id, name, color, isMolting,new Date(yearBorn, monthBorn, dayBorn));
        return chicken;
    }

}

