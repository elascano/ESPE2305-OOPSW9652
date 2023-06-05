package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.ChickenFarmer;
import ec.edu.espe.chickenfarm.model.Egg;
import ec.edu.espe.chickenfarm.model.Poop;

/**
 *
 * @author Edison Lascano, The Javas, DCCO-ESPE
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
        name="Edison Lascano";
        
        System.out.println("my name is --> " + name);

        System.out.println("chicken --> " + chicken);
        System.out.println("this is an int --> " + a);
        
        int numberWheels;
        numberWheels = 100;
        System.out.println("(Before) number Of wheels --> " + numberWheels);
        modify(numberWheels);
        System.out.println("(After)  number Of wheels --> " + numberWheels);
        
    }
    
    public static void modify(int numberOfWheels){
        numberOfWheels = 10;
    }

}
