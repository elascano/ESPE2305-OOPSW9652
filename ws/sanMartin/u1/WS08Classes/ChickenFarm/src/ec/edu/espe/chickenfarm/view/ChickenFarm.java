
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class ChickenFarm {
    public static void main(String[] args) {
        Poop poop;
        Egg egg;
        Chicken chicken;
        ArrayList<Chicken> chickens = new ArrayList<>();
        ArrayList<Chicken> chickens2 = new ArrayList<>();
        Coop coop1;
        Coop coop2;
        
        
        poop = new Poop(0);
        egg = new Egg(0);
        System.out.println("-----Chicken Farm by JOSE SANMARTIN-------");
        System.out.println("Chickens size --->"+chickens.size());
        chicken = new Chicken(1,"Lucy","w&b",false,LocalDate.of(2012,01, 01));
        System.out.println("Chicken-->"+chicken);
        chickens.add(chicken);
        chicken = new Chicken(2,"Maruja","w",true,LocalDate.of(2010,04, 30));
        System.out.println("Chicken-->"+chicken);
        chickens.add(chicken);
        chicken = new Chicken(3,"Claudia","b",false,LocalDate.of(2018,07, 01));
        chickens.add(chicken);
        chicken = new Chicken(4,"Robin","y",false, LocalDate.of(2015,12, 19));
        chickens.add(chicken);
        chicken = new Chicken(5,"Andy","brown",false, LocalDate.of(2022,05, 28));
        chickens.add(chicken);
         System.out.println("Chickens size --->"+chickens.size());
        chicken = new Chicken(1,"Jess","w&y",true, LocalDate.of(2015,12, 01));
        chickens2.add(chicken);
        chicken = new Chicken(2,"Cece","brown&y",true,LocalDate.of(2018,05, 9));
        chickens2.add(chicken);
        chicken = new Chicken(3,"Priscy","b",true, LocalDate.of(2015,8, 13));
        chickens2.add(chicken);
        chicken = new Chicken(4,"Turuleka","b&y",true, LocalDate.of(2020,1, 21));
        chickens2.add(chicken);
        chicken = new Chicken(5,"Benita","w",true, LocalDate.of(2022,8, 1));
        chickens2.add(chicken);      
       
        System.out.println("Chickens size --->"+chickens2.size());
        coop1 = new Coop(1, chickens);
        System.out.println("Chickens----> "+chickens);
        System.out.println("coop ---->"+ coop1);
        coop2 = new Coop(2, chickens2);
        System.out.println("Chickens----> "+chickens2);
        System.out.println("coop ---->"+ coop2);
        
    }
}
