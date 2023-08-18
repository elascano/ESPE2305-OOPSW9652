package ec.edu.espe.zoo.view;

import ec.edu.espe.zoo.model.Claw;
import ec.edu.espe.zoo.model.Tiger;
import ec.edu.espe.zoo.model.Tooth;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class Zoo {

    public static void main(String[] args) {
        ArrayList<Tooth> teeth = new ArrayList<>();
        teeth.add(new Tooth());
        teeth.add(new Tooth());

        Claw[] claws = new Claw[2];

        Tiger tiger = new Tiger(teeth, new Date(), claws);

        System.out.println(tiger);

    }
}
