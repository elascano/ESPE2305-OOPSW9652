
package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.ChickenFarmer;
import ec.edu.espe.chickenfarm.model.Egg;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class ChickenFarm {
    public static void main(String[] args) {
        Chicken chicken;
        Egg egg;
        ChickenFarmer chickenFarmer;
        int a;
        a=0;
        chicken= new Chicken();
        String name;
        name="Paul Moreno";
        
         System.out.println("my name is -->"+name);
        System.out.println("chicken--->"+chicken);
        System.out.println("this is a int--->"+a);
    }
}
