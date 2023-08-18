
package ec.edu.espe.zoo.model;

import ec.edu.espe.zoo.controller.Mammal;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class Lion extends Mammal{

    public Lion(ArrayList<Tooth> tooth, Date bornOn, Claw[] claw) {
        super(tooth, bornOn, claw);
    }


    @Override
    public void feed() {
        System.out.println("giving 3 kilograms of meat");
    }

    @Override
    public void born() {
         bornOn = new Date();
        System.out.println(bornOn);
    }
    
}
