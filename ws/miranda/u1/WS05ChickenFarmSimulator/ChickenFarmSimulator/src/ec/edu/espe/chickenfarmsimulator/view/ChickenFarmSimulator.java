
package ec.edu.espe.chickenfarmsimulator.view;

import ec.edu.espe.chickenfarmsimulator.model.Chicken;
import java.util.Date;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        
        Chicken chicken;
        chicken = new Chicken();
        chicken.doStuff(0);
        
        chicken.setId(1);
        chicken.setName("Pepita");
        chicken.setColor("white and black");
        chicken.setAge(19);
        chicken.setIsMolting(false);
        chicken.setBornOnDate(new Date());
        
        System.out.println("My chicken is --> " + chicken);
    }
}
