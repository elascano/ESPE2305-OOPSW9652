package ec.edu.espe.chinkenfarm.view;

import ec.edu.espe.chinkenfarm.model.Chicken;
import java.util.Date;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        Chicken chicken;
        chicken = new Chicken();
        chicken.doStuff(0);
        chicken.setId(1);
        chicken.setName("Diego");
        chicken.setColor("yellow");
        chicken.setAge(2);
        chicken.setIsMolting(true);
        chicken.setBornOnDate(new Date());
        System.out.println("My chicken is " + chicken);
    }
}
