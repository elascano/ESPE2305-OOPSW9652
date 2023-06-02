package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Date;

/**
 *
 * @author Cesar Galarza, BugBusters, DCCO-ESPE
 */
public class ChickenFarmSimulation {
    public static void main(String[] args) {
        Chicken chicken;
        chicken = new Chicken();
        chicken.doStuff(0);
        
        chicken.setId(1);
        chicken.setName("Pio");
        chicken.setColor("Yellow");
        chicken.setAge(1);
        chicken.setIsMolting(true);
        chicken.setBornOnDate(new Date());
        
        
        System.out.println("my chicken is --> " + chicken);
    }
}
