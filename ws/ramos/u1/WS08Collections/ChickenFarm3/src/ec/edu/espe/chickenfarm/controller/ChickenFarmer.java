package ec.edu.espe.chickenfarm.controller;

import ec.edu.espe.chicken.model.Chicken;
import ec.edu.espe.chicken.model.Coop;
import ec.edu.espe.chicken.model.Egg;
import ec.edu.espe.chicken.model.Poop;
import java.util.ArrayList;
import java.util.Date;

//LocalTime, Calendar, LocalDate, LocalDateTime instead of Date
/**
 *
 * @author Javier Ramos 
 */
public class ChickenFarmer {
    Chicken chickens[];
    
    public static void main(String[] args) {
        Poop poop;
        Egg egg;
        Chicken chicken;
        ArrayList<Chicken> chickens = new ArrayList<>();
               ArrayList<Chicken> chickens2 = new ArrayList<>(); 
        Coop coop;
        Coop coop2;
        
        System.out.println("chickens size --> " + chickens.size());
        
        egg = new Egg(0);
        chicken = new Chicken(1, "Lucy", "w&b", false, new Date(70, 11, 17));
        chickens.add(chicken);
        poop = new Poop(chicken.getId());
        
        System.out.println("Chicken --> " + chicken);

        chicken = new Chicken(2, "maruja", "w", true, new Date());
        chickens.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("chickens size --> " + chickens.size());
        
        coop = new Coop(1, chickens);
        System.out.println("chickens --> " + chickens);
        
        coop2 = new Coop(2, chickens2);
     
        System.out.println("coop --> " + coop);
    }
}