package ec.edu.espe.chickenfarm.controller;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class KeepChickens {
    
    public Chicken keepChickens(){
        int id;
        int age;
        int year;
        int month;
        int day;
        String name;
        String color;
        boolean isMolting;
        Chicken k;
        
        Scanner sc = new Scanner(System.in);
               
        System.out.print("Id: ");
        id = sc.nextInt();
        System.out.print("Name: ");
        name = sc.next();
        System.out.print("Color: ");
        color = sc.next();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.print("Is molting(True/False)?: ");
        isMolting = sc.nextBoolean();
        System.out.print("Born Year: ");
        year = sc.nextInt();
        System.out.print("Born Month: ");
        month = sc.nextInt();
        System.out.print("Born Day: ");
        day = sc.nextInt();
        
        k = new Chicken(id, name, color, isMolting, new Date(year, month, day));
        return k;
    }
    
}
