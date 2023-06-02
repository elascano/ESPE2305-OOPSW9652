
package ec.edu.edpe.chickenfarm.view;

import ec.edu.edpe.chickenfarm.model.Chicken;
import ec.edu.edpe.chickenfarm.model.Coop;
import ec.edu.edpe.chickenfarm.model.Egg;
import ec.edu.edpe.chickenfarm.model.Poop;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

//LocalTime, Calendar, LocalDate, LocalDateTime instead of Date

/**
 *
 * @author Edison Ludeña, BugBuster, DCCO-ESPE
 */
public class ChickenFarm {
    public static void main(String[] args) {
        Poop poop;
        Egg egg;
        Chicken chicken;
        Chicken chicken2;
        ArrayList<Chicken> chickens = new ArrayList<>();
        ArrayList<Chicken> chickens2 = new ArrayList<>();
        Coop coop;
        Coop coop2;
        
        System.out.println("chickens size '': "+ chickens.size());
        egg = new Egg(0);
        System.out.println("-------------------------Chicken Farm by EDISON LUDENA-------------------------");
        chicken = new Chicken(1, "Lucy", "White", true,LocalDate.of(2020,02,14));
        chickens.add(chicken);
        System.out.println("chickens size '': "+ chickens.size());
        poop = new Poop(chicken.getId());
        System.out.println("Chicken ---> "+ chicken);
        
        chicken = new Chicken(2,"maruja","w",true,LocalDate.of(2015,04,3));
        System.out.println("Chicken --> " + chicken);
        chickens.add(chicken);
        System.out.println("chickens size '': "+ chickens.size());
        
        chicken = new Chicken(3,"maria","b&bl",false,LocalDate.of(2001,01,30));
        System.out.println("Chicken --> " + chicken);
        chickens.add(chicken);
        System.out.println("chickens size '': "+ chickens.size());
        
        chicken = new Chicken(4,"estefany","blue",true,LocalDate.of(2008,11,17));
        System.out.println("Chicken --> " + chicken);
        chickens.add(chicken);
        System.out.println("chickens size '': "+ chickens.size());
        
        chicken = new Chicken(5,"Juana","red&yll",false,LocalDate.of(2019,07,19));
        System.out.println("Chicken --> " + chicken);
        chickens.add(chicken);
        System.out.println("chickens size '': "+ chickens.size());
        
        
        coop = new Coop(1,chickens);
        System.out.println("");
        System.out.println("chickens -->"+ chickens);
        System.out.println("");
        
        chicken2 = new Chicken(1,"Pepa","white",true,LocalDate.of(2007,10,6));
        System.out.println("Chicken --> " + chicken2);
        chickens2.add(chicken);
        System.out.println("chickens size '': "+ chickens2.size());
        
        chicken2 = new Chicken(2,"carla","yll&black",false,LocalDate.of(2011,06,25));
        System.out.println("Chicken --> " + chicken2);
        chickens2.add(chicken2);
        System.out.println("chickens size '': "+ chickens2.size());
        
        chicken2 = new Chicken(3,"carolina","black",true,LocalDate.of(2006,04,21));
        System.out.println("Chicken --> " + chicken2);
        chickens2.add(chicken2);
        System.out.println("chickens size '': "+ chickens2.size());
        
        chicken2 = new Chicken(4,"luisa","red",false,LocalDate.of(2021,01,11));
        System.out.println("Chicken --> " + chicken2);
        chickens2.add(chicken2);
        System.out.println("chickens size '': "+ chickens2.size());
        
        chicken2 = new Chicken(5,"perla","brown",true,LocalDate.of(2003,05,22));
        System.out.println("Chicken --> " + chicken2);
        chickens2.add(chicken2);
        System.out.println("chickens size '': "+ chickens2.size());
        
        coop2 = new Coop(2,chickens2) ;
        System.out.println("");
        System.out.println("chickens2 -->"+ chickens2);
        System.out.println("");
        System.out.println("");
        
        System.out.println("coop --> " + coop);
        System.out.println("coop --> " + coop2);
    
    }
}
