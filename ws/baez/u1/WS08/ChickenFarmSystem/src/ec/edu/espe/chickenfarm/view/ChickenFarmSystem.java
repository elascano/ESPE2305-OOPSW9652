/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.Date;
import java.util.ArrayList;

//LocalTime, Calendar, LocalDate, LocalDateTime instead of Date
/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class ChickenFarmSystem {
    Chicken chickens[];
    
    public static void main(String[] args) {
        Poop poop;
        Egg egg;
        Chicken chicken;
        
        ArrayList<Chicken> chickens = new ArrayList<>();
        ArrayList<Chicken> chickens2 = new ArrayList<>();
        ArrayList<Chicken> chickens3 = new ArrayList<>();
        ArrayList<Chicken> chickens4 = new ArrayList<>();
        ArrayList<Chicken> chickens5 = new ArrayList<>();
        ArrayList<Chicken> chickens6 = new ArrayList<>();
        ArrayList<Chicken> chickens7 = new ArrayList<>();
        ArrayList<Chicken> chickens8 = new ArrayList<>();
        
        Coop coop;
        Coop coop2;
        Coop coop3;
        Coop coop4;
        Coop coop5;
        Coop coop6;
        Coop coop7;
        Coop coop8;
        
        System.out.println("--------Chicken Farm by Gabriel Báez----------");
        System.out.println("chickens size --> " + chickens.size());
        
        egg = new Egg(0);
        chicken = new Chicken(1, "Lucy", "b", false, new Date(3, 3, 3));
        chickens.add(chicken);
        poop = new Poop(chicken.getId());
        
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(2, "Maruja", "w", true, new Date());
        chickens.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("chickens size --> " + chickens.size());
        
        chicken = new Chicken(3, "Jack", "w", true, new Date(2004, 5, 9));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(4, "Maruja", "w", true, new Date());
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(5, "Maruja", "w", true, new Date());
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(6, "Maruja", "w", true, new Date());
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(7, "Maruja", "w", true, new Date());
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(8, "Maruja", "w", true, new Date());
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        
        System.out.println("Chicken --> " + chicken);
        coop = new Coop(1, chickens);
        System.out.println("chichens -->" + chickens);
        
        coop2 = new Coop(2, chickens2);
        System.out.println("Coop --> " + coop);
        
        coop3 = new Coop(3, chickens3);
        System.out.println("Coop --> " + coop);
        
        coop4 = new Coop(4, chickens4);
        System.out.println("Coop --> " + coop);
        
        coop5 = new Coop(5, chickens5);
        System.out.println("Coop --> " + coop);
        
        coop6 = new Coop(6, chickens6);
        System.out.println("Coop --> " + coop);
        
        coop7 = new Coop(7, chickens7);
        System.out.println("Coop --> " + coop);
        
        coop8 = new Coop(8, chickens8);
        System.out.println("Coop --> " + coop);
    }
}
