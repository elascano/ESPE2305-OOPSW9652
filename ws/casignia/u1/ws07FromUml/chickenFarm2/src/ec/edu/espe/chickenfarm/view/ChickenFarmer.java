package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import ec.edu.espe.chickenfarm.model.Poop;

/**
 *
 * @author Diego Casignia, Techwer, DCCO-ESPE
 */
public class ChickenFarmer {
    public static void main(String[] args){
        
        Chicken chicken;
        Poop poop;
        Egg egg;
        ChickenFarmer chickenFarmer;
        int a; 
        a=0;
        chicken = new Chicken();
        String name;
        name = "Diego Casignia";
        System.out.println("Mi name is: "+ name);
    }   

    private static class Egg {

        public Egg() {
        }
    }
}
