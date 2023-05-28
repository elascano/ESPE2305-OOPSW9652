package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.util.ArrayList;
import java.util.Date;

//LocalTime, Calendar, LocalDate, LocalDateTime instead of Date
/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
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
        
        System.out.println("--- Alison Miranda`s ChickenFarm ---");
        egg = new Egg(0);
        chicken = new Chicken(1, "Pepita", "w&b", false, new Date(70, 0, 10));
        chickens.add(chicken);
        poop = new Poop(chicken.getId());        
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(2, "Juanita", "b", true, new Date(69, 11, 22));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(3, "Blanca", "w", false, new Date(71, 1, 11));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(4, "Pablo", "w", false, new Date(72, 2, 12));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(5, "Juan", "b", true, new Date(73, 3, 13));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);    
        System.out.println("chickens size --> " + chickens.size());        

        
        chicken = new Chicken(1, "Diego", "w&b", false, new Date(74,4, 14));
        chickens2.add(chicken);
        System.out.println("\nChicken --> " + chicken);
        
        chicken = new Chicken(2, "Pepe", "b", true, new Date(75,5, 15));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(3, "Toby", "w", false, new Date(76,6, 16));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken); 
        
        chicken = new Chicken(4, "Mateo", "b", true, new Date(77,7, 17));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);        
        
        chicken = new Chicken(5, "Spike", "w", false, new Date(78,8, 18));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken); 
        
        System.out.println("chickens size --> " + chickens.size());        
        

        System.out.println("--- Alison Miranda`s ChickenFarm ---");
        coop = new Coop(1, chickens);
        System.out.println("Chickens coop 1: \n" + chickens);
        
        System.out.println("--- Alison Miranda`s ChickenFarm ---");
        coop2 = new Coop(2, chickens2);
        System.out.println("Chickens coop 2: \n" +chickens2);
        
    }
}
