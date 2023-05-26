
package ec.edu.espe.chinkenfarm.view;

import ec.edu.espe.chinkenfarm.model.Chicken;
import java.util.Date;

/**
 *
 * @author Paul Moreno,The Encoders,DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        Chicken chicken;
        chicken = new Chicken();
        chicken.doStuff(0);
        
        chicken.setId(1);
        chicken.setName("Paul");
        chicken.setColor("white and brown");
        chicken.setAge(21);
        chicken.setIsMolting(true);
        chicken.setBornOnDate(new Date());
        
        System.out.println("my chicken is --->"+ chicken);
    }
    
}
