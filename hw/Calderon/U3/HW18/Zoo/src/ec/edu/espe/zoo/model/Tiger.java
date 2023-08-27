package ec.edu.espe.zoo.model;

import ec.edu.espe.zoo.controller.Mammal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class Tiger extends Mammal {

    public Tiger(ArrayList<Tooth> tooth, Date bornOn, Claw[] claw) {
        super(tooth, bornOn, claw);
    }

    @Override
    public String toString() {
        return "Tiger{"
                + "tooth=" + getTooth()
                + ", bornOn=" + bornOn
                + ", claw=" + Arrays.toString(getClaw())
                + '}';
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
