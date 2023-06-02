
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Coop;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class Chickenfarm {
    public static void main(String[] args) {
        Poop poop;
        Egg egg;
        Chicken chicken;
        ArrayList<Chicken> chickens= new ArrayList<>();
        ArrayList<Chicken> chickens2 = new ArrayList<>();
        Coop coop;
        Coop coop2;
         
       System.out.println("Farm of Paul Moreno");
        System.out.println("----Chickens----");
        egg= new Egg(0);
        chicken= new Chicken(1, "Lucy", "w&b", false, LocalDate.of(2021,1,17));
        chickens.add(chicken);
        poop=new Poop(chicken.getId());
        
        chicken= new Chicken(2, "maruja", "w", true, LocalDate.of(2020,1,03));
        chickens.add(chicken);
        //System.out.println("Chicken--->"+chicken);
        chicken=new Chicken(3, "bianca", "b", false, LocalDate.of(2001,1,2));
        chickens.add(chicken);
        chicken=new Chicken(4, "Candy", "w&b", false, LocalDate.of(2003,9,21));
        chickens.add(chicken);
        chicken=new Chicken(5, "Lilly", "w", true, LocalDate.of(1999,11,4));
        chickens.add(chicken);
        
        
        System.out.println("chickens size---->"+chickens.size());
        chicken=new Chicken(1, "Pita", "b", false, LocalDate.of(2009,6,22));
        chickens2.add(chicken);
        chicken=new Chicken(2, "Wendy", "w&b", false, LocalDate.of(2015,5,31));
        chickens2.add(chicken);
        chicken=new Chicken(3, "Nana", "w", true, LocalDate.of(2022,7,1));
        chickens2.add(chicken);
        chicken=new Chicken(4, "Sky", "w", true, LocalDate.of(2000,3,9));
        chickens2.add(chicken);
        chicken=new Chicken(5, "Tita", "b", false, LocalDate.of(1999,8,3));
        chickens2.add(chicken);
       

        coop= new Coop(1, chickens);
        System.out.println("chickens---->"+chickens);
        System.out.println("chickens2 size---->"+chickens2.size());
        coop2=new Coop(2,chickens2);
        System.out.println("chickens---->"+chickens2);
        
        
        System.out.println("----Coops----");
        System.out.println("coop--->"+coop);
        System.out.println("coop2--->"+coop2);
    }
            
}
