
package ec.edu.espe.chikenfarm.view;

import ec.edu.espe.chikenfarm.model.Chiken;
import ec.edu.espe.chikenfarm.model.ChikenFarmer;
import ec.edu.espe.chikenfarm.model.Egg;
import ec.edu.espe.chikenfarm.model.Poop;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class ChickenFarm {
    
    public static void main(String[] args){
    
    Chiken chicken;
    Poop poop;
    Egg egg;
    ChikenFarmer chickenFarmer;
    
    int a;
    a=0;
    chicken = new Chiken();
    poop = new Poop();
    egg = new Egg();
    String name;
    name = "Calderon Jilmar";
    
    System.out.println("chiken -->" + chicken);
    System.out.println("poop -->" + poop);
    System.out.println("egg -->" + egg);
    System.out.println("my name is -->" + name);
    
    }
    
}
