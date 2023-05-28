
package ec.edu.espe.chickenFarm.view;

import ec.edu.espe.chickenFarm.model.Chicken;
import ec.edu.espe.chickenFarm.model.Coop;
import ec.edu.espe.chickenFarm.model.Egg;
import ec.edu.espe.chickenFarm.model.Poop;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Juan Rueda, The Javas, DCCO-ESPE
 */
public class ChickenFarm {
   
    public static void main(String[] args) {
        Poop poop;
        Egg egg;
        System.out.println("------Chicken Farm By JUAN RUEDA------");
        Chicken chicken;
        ArrayList<Chicken> chickens = new ArrayList<>();
        ArrayList<Chicken> chickens2 = new ArrayList<>();
        Coop coop;
        Coop coop2;
               
        egg = new Egg (0);
        chicken = new Chicken(1,"Lucy","w&b", false,LocalDate.of(1999,1,1));
        chickens.add(chicken);
        poop = new Poop(chicken.getId());
        
        System.out.println("Chicken ---->"+ chicken);
        System.out.println("chickens size ---->"+ chickens.size());
        
        chicken = new Chicken(2,"maruja","w", true, LocalDate.of(1985,1,5));
        chickens.add(chicken);
        System.out.println("Chicken --->"+ chicken);
        System.out.println("chickens size ---->"+ chickens.size());
        
        chicken = new Chicken(3,"Kiko","b", true, LocalDate.of(1994,5,14));
        chickens.add(chicken);
        System.out.println("Chicken --->"+ chicken);
        System.out.println("chickens size ---->"+ chickens.size());
        
        chicken = new Chicken(4,"Nala","br", false, LocalDate.of(1990,9,25));
        chickens.add(chicken);
        System.out.println("Chicken --->"+ chicken);
        System.out.println("chickens size ---->"+ chickens.size());
        
        chicken = new Chicken(5,"pepe","w", true, LocalDate.of(2019,11,10));
        chickens.add(chicken);
        System.out.println("Chicken --->"+ chicken);
        System.out.println("chickens size ---->"+ chickens.size());
        
        coop = new Coop(1, chickens);
        System.out.println("coop1 --->"+ coop);
        System.out.println("chickens --->"+chickens);
        
        chicken = new Chicken(1,"simba","b", true, LocalDate.of(2006,7,23));
        chickens2.add(chicken);
        System.out.println("Chicken --->"+ chicken);
        System.out.println("chickens size ---->"+ chickens2.size());
        
        chicken = new Chicken(2,"coco","w", true, LocalDate.of(2011,5,11));
        chickens2.add(chicken);
        System.out.println("Chicken --->"+ chicken);
        System.out.println("chickens size ---->"+ chickens2.size());
        
        chicken = new Chicken(3,"picachu","w&b", true, LocalDate.of(2015,2,1));
        chickens2.add(chicken);
        System.out.println("Chicken --->"+ chicken);
        System.out.println("chickens size ---->"+ chickens2.size());
        
        chicken = new Chicken(4,"luna","br", true, LocalDate.of(1990,1,2));
        chickens2.add(chicken);
        System.out.println("Chicken --->"+ chicken);
        System.out.println("chickens size ---->"+ chickens2.size());
        
        chicken = new Chicken(5,"daisy","br", true, LocalDate.of(1991,3,29));
        chickens2.add(chicken);
        System.out.println("Chicken --->"+ chicken);
        System.out.println("chickens size ---->"+ chickens2.size());
        
        
        coop2= new Coop(2,chickens2);
        System.out.println("coop2---->"+ coop2);
        System.out.println("chickens --->"+chickens2);
          
    }
    
}
