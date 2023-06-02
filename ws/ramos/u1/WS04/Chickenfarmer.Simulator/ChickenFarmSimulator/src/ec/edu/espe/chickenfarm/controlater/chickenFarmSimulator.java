
package ec.edu.espe.chickenfarm.controlater;

import ec.edu.espe.chicken.model.Chicken;
import java.util.Date;

/**
 *
 * @author JAVIER
 */
public class chickenFarmSimulator {
    public static void main(String[] args) {
       Chicken chicken; 
       chicken = new Chicken();
       chicken.doStuff(0);
       
       chicken.setId(5);
       chicken.setName("Javier");
       chicken.setColor("While and browm");
       chicken.setAge(24);
       chicken.setIsMulting(true);
       chicken.setBornOnDate(new Date());
       
       
       
       
        System.out.println("my chicken is ----->"+chicken);
    }
    
}
