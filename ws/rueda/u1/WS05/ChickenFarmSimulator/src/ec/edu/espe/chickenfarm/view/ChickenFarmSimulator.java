
package ec.edu.espe.chickenfarm.view;
import ec.edu.espe.chickenfarm.model.chicken;
import java.util.Date;


/**
 *
 * @author Juan Rueda, The Javas, DCCO-ESPE
 */
public class ChickenFarmSimulator {
    public static void main(String[] args) {
        Chicken chicken;
        chicken = new Chicken();
        chicken.doStuff(0);
        
        chicken.setid(1);
        chicken.setName=("Martina");
        chicken.setColor=("Black");
        chicken.setAge(2);
        chicken.setisMolting(true);
        chicken.setBornDate(new Date(1));
                
        System.out.println("my chicken is " + chicken);
        
    }
}
