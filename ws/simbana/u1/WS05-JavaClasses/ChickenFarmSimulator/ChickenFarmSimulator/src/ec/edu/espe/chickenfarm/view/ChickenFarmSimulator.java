package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Date;

/**
 *
 * @author Michael Simbana, POO-ERATION, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        Chicken chicken;
        chicken = new Chicken();
        chicken.doStuff(0);
        
        chicken.setId(1);
        chicken.setName("Lucy");
        chicken.setColor("White and bronw");
        chicken.setAge(2);
        chicken.setIsMolting(true);
        chicken.setBornOnDate(new Date());
        
        
        System.out.println("my chicken is --> "+chicken);
    }
    
}
