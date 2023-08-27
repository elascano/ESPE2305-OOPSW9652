
package ec.edu.espe.zoo.model;

import java.util.Date;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class Condor extends Bird{

    public Condor(Date bornOn, Claw[] claw) {
        super(bornOn, claw);
    }

    @Override
    public void feed() {
        System.out.println("giving 3 kilos of meat");
    }

    @Override
    public void born() {
        bornOn = new Date();
        System.out.println(bornOn);
    }
    
}
