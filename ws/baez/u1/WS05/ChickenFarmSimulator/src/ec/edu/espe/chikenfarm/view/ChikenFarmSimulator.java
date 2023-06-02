package ec.edu.espe.chikenfarm.view;

import ec.edu.espe.chikenfarm.model.Chicken;
import java.util.Date;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class ChikenFarmSimulator {
    public static void main(String[] args){
        Chicken chicken;
        chicken = new Chicken();
        chicken.doStuff(0);
        
        
        chicken.setId(1);
        chicken.setName("Alex");
        chicken.setColor("black");
        chicken.setAge(1);
        chicken.setIsMolting(true);
        chicken.setBorOnDate(new Date());
        
        
        System.out.println("my chicken is ---> " + chicken);
        
    }

}

