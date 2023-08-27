
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class Eagle extends Bird{

    public Eagle(Date bornOn, Claw[] claw) {
        super(bornOn, claw);
    }


    @Override
    public void feed() {
        System.out.println("giving him a chicken to eat");
    }

    @Override
    public void born() {
        bornOn = new Date();
        System.out.println(bornOn);
    }
    
}
