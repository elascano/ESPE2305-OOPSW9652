package ec.edu.espe.chikenfarm.view;

import ec.edu.espe.chikenfarm.model.Chiken;
import java.util.Date;
/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        Chiken chicken;
        chicken = new Chiken();
        chicken.doStuff(0);
        
        chicken.setId(1);
        chicken.setName("Juan");
        chicken.setColor("Black and white");
        chicken.setAge(4);
        chicken.setIsMolting(true);
        chicken.setBornOnDate(new Date());
       
        System.out.println("my chicken is --> " + chicken);
    }
}
