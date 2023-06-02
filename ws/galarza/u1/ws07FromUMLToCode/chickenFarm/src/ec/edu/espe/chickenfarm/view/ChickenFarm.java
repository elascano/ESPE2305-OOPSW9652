package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.ChickenFarmer;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;

/**
 *
 * @author Cesar Galarza, BugBusters, DCCO-ESPE
 */
public class ChickenFarm {
    
    public static void main(String[] args) {
        Chicken chicken;
        Poop poop;
        Egg egg;
        ChickenFarmer chickenFarmer;
        int a;
        a=0;
        chicken = new Chicken();
        String name;
        name="Cesar Galarza";
        
        System.out.println("my name is --> " + name);
        System.out.println("chicken -->" + chicken);
        System.out.println("this is the int a -->" + a);
    }
}
