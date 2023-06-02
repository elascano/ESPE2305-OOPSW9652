package ec.edu.espe.chinkenfarm.view;

import ec.edu.espe.chinkenfarm.model.Chicken;
import java.util.Date;

/**
 *
 * @author Edison Lascano, The Javas, DCCO-ESPE
 */
public class ChickenFarmSimulator {

    public static void main(String[] args) {
        Chicken chicken;
        chicken = new Chicken();
        chicken.doStuff(0);

        chicken.setId(1);
        chicken.setName("Lucy");
        chicken.setColor("white and brown");
        chicken.setAge(2);
        chicken.setIsMolting(true);
        chicken.setBornOnDate(new Date());

        System.out.println("(Before) my chicken is --> " + chicken);

        int numberWheels=10;
        System.out.println("(Before) number Of Wheels --> " + numberWheels);
        modify(numberWheels);
        System.out.println("(After ) number Of Wheels --> " + numberWheels);
        
        System.out.println("(Before) my chicken is --> " + chicken);
        modify(chicken);
        System.out.println("(After ) my chicken is --> " + chicken); //Lucy or Priscila?
        

    }
    
    //overloading
    public static void modify(int numberOfWheels){
        numberOfWheels = 20;
    }
    
    public static void modify(Chicken localChicken){
        localChicken.setName("Priscila");
    }

    
}
