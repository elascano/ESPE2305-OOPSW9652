package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.model.Chicken;
import java.util.Date;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        Chicken chicken;
        chicken= new Chicken();
        chicken.doStuff(0);
        
        chicken.setId(2);
        chicken.setName("Maricela");
        chicken.setAge(4);
        chicken.setColor("White");
        chicken.setIsMolting(true);
        chicken.setBornOnDate(new Date());
        
        System.out.println("my chicken is --> "+ chicken);
    }
}
