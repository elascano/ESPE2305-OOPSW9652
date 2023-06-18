package ec.edu.espe.chickenfarmsystem.view;

import ec.edu.espe.chickenfarmsystem.model.Chicken;
import ec.edu.espe.chickenfarmsystem.model.Coop;
import ec.edu.espe.chickenfarmsystem.model.Egg;
import ec.edu.espe.chickenfarmsystem.model.Poop;
import java.util.ArrayList;
import java.util.Date;

//LocalTime, Calendar, LocalDate, LocalDateTime instead of Date
/**
 *
 * @author Cesar Galarza, BugBusters, DCCO-ESPE
 */

public class ChickenFarm {
    Chicken chickens[];
    
    public static void main(String[] args) {
        Poop poop;
        Egg egg;
        Chicken chicken;
        
        ArrayList<Chicken> chickens = new ArrayList<>();
        ArrayList<Chicken> chickens2 = new ArrayList<>();
        
        Coop coop;
        Coop coop2;
        
        egg = new Egg(0);
        
        //Initialize first coop
        System.out.println("-----Farmer Cesar Galarza present:");
        System.out.println("Chicken Farm System---------------");
        System.out.println("chickens size --> " + chickens.size());
        
        chicken = new Chicken(1, "Lucy", "white & brown", true, new Date(1970, 11, 17));
        chickens.add(chicken);
        poop = new Poop(chicken.getId());
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("chickens size --> " + chickens.size());

        chicken = new Chicken(2, "Maruja", "white", true, new Date(1971,7,31));
        chickens.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("chickens size --> " + chickens.size());
        
        chicken = new Chicken(3, "Nancy", "brown", true, new Date(2020,10,26));
        chickens.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("chickens size --> " + chickens.size());
        
        chicken = new Chicken(4, "Darkness", "black & white", true, new Date(2021,6,4));
        chickens.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("chickens size --> " + chickens.size());
        
        chicken = new Chicken(5, "Alisson", "black", true, new Date(2019,5,6));
        chickens.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("chickens size --> " + chickens.size());
        
        coop = new Coop(1, chickens);
        System.out.println("chickens --> " + chickens);
        System.out.println("Coop --> " + coop);
        
        //Initialize second coop
        System.out.println("chickens2 size --> " + chickens2.size());
        
        chicken = new Chicken(1, "Aqua", "grey", true, new Date(2015,4,25));
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("chickens2 size --> " + chickens2.size());
        
        chicken = new Chicken(2, "Colorada", "red", true, new Date(2017,9,28));
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("chickens2 size --> " + chickens2.size());
        
        chicken = new Chicken(3, "Mary", "yellow", true, new Date(2018,0,13));
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("chickens2 size --> " + chickens2.size());
        
        chicken = new Chicken(4, "Mirai", "black & brown", true, new Date(2023,3,30));
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("chickens2 size --> " + chickens2.size());
        
        chicken = new Chicken(5, "Pauline", "red & white", true, new Date(2001,11,4));
        chickens2.add(chicken);
        
        System.out.println("Chicken --> " + chicken);
        System.out.println("chickens2 size --> " + chickens2.size());
        
        coop2 = new Coop(2, chickens2);
        System.out.println("chickens2 --> " + chickens2);
        System.out.println("Coop 2 --> " + coop2);
    }
}
