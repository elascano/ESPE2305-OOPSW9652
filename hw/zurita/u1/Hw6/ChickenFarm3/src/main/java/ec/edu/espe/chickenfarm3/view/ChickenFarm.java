
package ec.edu.espe.chickenfarm3.view;

import ec.edu.espe.chickenfarm3.model.Chicken;
import ec.edu.espe.chickenfarm3.model.Coop;
import ec.edu.espe.chickenfarm3.model.Egg;
import ec.edu.espe.chickenfarm3.model.Poop;
import java.util.ArrayList;
import java.util.Date;

//LocalTime, calendar, LocalDate, LocalDateTime
/**
 *
 * @author PabloEZurita
 */
public class ChickenFarm {
    public static void main(String[] args) {
        Poop poop;
        Egg egg;
        Chicken chicken;
        ArrayList<Chicken> chickens = new ArrayList<>();
        ArrayList<Chicken> chickens2 = new ArrayList<>();
        Coop coop;
        Coop coop2;
        
        
        
        
       
       egg = new Egg(0);
       poop = new Poop(0);
       
       chicken = new Chicken(1, "Lucy", "w&b", false, new Date(70,0,1));
       chickens.add(chicken);
       
       chicken = new Chicken(2, "Maruja", "w", true, new Date(64,4,3));
       chickens.add(chicken);
       
       chicken = new Chicken(3, "Taty", "w", true, new Date(67,5,2));
       chickens.add(chicken);
       
       chicken = new Chicken(4, "Gaby", "w", true, new Date(85,1,2));
       chickens.add(chicken);
       
       chicken = new Chicken(5, "Alisson Miranda", "w", true, new Date(95,3,3));
       chickens.add(chicken);
      
       
       chicken = new Chicken(1, "Durazno", "w&b", false, new Date(64,5,1));
       chickens2.add(chicken);
       
       chicken = new Chicken(2, "Piña", "w", true, new Date(92,4,9));
       chickens2.add(chicken);
       
       chicken = new Chicken(3, "Fresa", "w", true, new Date(88,3,12));
       chickens2.add(chicken);
       
       chicken = new Chicken(4, "Naranja", "w", true, new Date(97,7,7));
       chickens2.add(chicken);
       
       chicken = new Chicken(5, "Mandarina", "w", true, new Date(65,10,12));
       chickens2.add(chicken);
       
        
        
        coop = new Coop(1, chickens);
        System.out.println("Chicken Size ->" + chickens.size());
        System.out.println("Chicneks ->" + chickens);
        System.out.println("Coop ->" + coop);
        coop2 = new Coop(2, chickens);
        System.out.println("Chicken Size ->" + chickens2.size());
        System.out.println("Chicneks ->" + chickens2);
        System.out.println("Coop 2 ->" + coop);
        
    }
}
