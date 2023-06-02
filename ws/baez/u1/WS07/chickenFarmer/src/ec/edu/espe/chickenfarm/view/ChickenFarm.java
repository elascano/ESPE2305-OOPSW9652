package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.ChickenFarmer;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class ChickenFarm {
    public static void main(String[] args) {
        Chicken chicken;
        Poop poop;
        Egg egg;
        ChickenFarmer chickenfarmer;
        int a;
        a=0;
        chicken = new Chicken();
        String name;
        name = "Gabriel Baez";
        
        System.out.println("my name is ---> " + name);
        System.out.println("this is an int ---> " + a);
        System.out.println("chicken---> " + chicken);
        System.out.println("");
    }
    
    
    
}
