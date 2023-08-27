
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class Pigeon extends Bird {

    public Pigeon(Date bornOn, Claw[] claw) {
        super(bornOn, claw);
    }

    @Override
    public void feed() {
        System.out.println("giving him a valance to eat");
    }
    
}
