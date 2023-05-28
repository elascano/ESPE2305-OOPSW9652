
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Eggs;
import ec.edu.espe.chickenfarm.model.Poop;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class ChickenFarm {
    
    public static void main(String[] args){
    
        Poop poop;
        Eggs egg;
        Chicken chicken;
            ArrayList<Chicken> chickens = new ArrayList<>();
            ArrayList<Chicken> chickens2 = new ArrayList<>(); 
        Coop coop;
        Coop coop2;
        
         //System.out.println("chickens size --> " + chickens.size());
        System.out.println("\n Nombre: Calderon Jilmar\n");
        
        egg = new Eggs(0);
        chicken = new Chicken(1, "Pepe", "w&b", false, LocalDate.of(1970, 11, 17));
        chickens.add(chicken);
        poop = new Poop(chicken.getId());

        //System.out.println("\nChicken --> " + chicken);
        
        chicken = new Chicken(2, "Maruja", "w", true, LocalDate.of(1990,1,23));
        chickens.add(chicken);
        
        //System.out.println("\nChicken --> " + chicken);
        System.out.println("\nchickens size --> " + chickens.size() +"\n");

        
        
        coop = new Coop(1, chickens);
        System.out.println("\nchickens --> " + chickens +"\n");
        //Calderon Jilmar
        
        chicken = new Chicken(2, "Maria", "w", true, LocalDate.of(1999,2,23));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(3, "Poli", "w", true, LocalDate.of(1989,6,2));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(4, "Pancha", "w", true, LocalDate.of(2002,2,23));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(5, "Pepa", "w", true, LocalDate.of(1970,8,1));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(6, "Lisa", "w", true, LocalDate.of(1999,12,31));
        chickens.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        
        chicken = new Chicken(2, "Peruja", "b&g", true, LocalDate.of(1960,2,1));
        chickens2.add(chicken);
        
        System.out.println("\nchickens2 size --> " + chickens2.size() +"\n");
        
        coop2 = new Coop(2, chickens2);
     
        System.out.println("\ncoop --> " + chickens2 +"\n");
        
        
        chicken = new Chicken(8, "Lima", "G", true, LocalDate.of(2003,2,23));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(9, "Sol", "w&w", true, LocalDate.of(2023,3,25));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(11, "Man", "w&b", true, LocalDate.of(1978,6,6));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(12, "Pipa", "b", true, LocalDate.of(2019,5,3));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
        
        chicken = new Chicken(13, "Cos", "b&w", true, LocalDate.of(2010,1,1));
        chickens2.add(chicken);
        System.out.println("Chicken --> " + chicken);
       
        
    }
    
}
