
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.ChickenFarmer;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class ChickenFarm {
    public static void main(String[] args) {
        Chicken chicken;
        Poop poop;
        Egg egg;
        ChickenFarmer chickenfarmer;
        
        int a;
        a = 0;
        
        chicken = new Chicken();
        
        String name;
        name = "Alison Miranda";
        
        System.out.println("My name is --> "+ name);
        System.out.println("Chicken --> "+ chicken);
        System.out.println("This is an int --> "+ a);
        
        
    }
 
}
