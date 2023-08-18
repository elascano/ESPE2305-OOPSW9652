
package ec.edu.espe.animals.model;

import ec.edu.espe.animals.controller.Bird;
import java.util.Date;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class Pigeon implements Bird {

    @Override
    public void drawBeak() {
        System.out.println("Im drawing beaks");
    }

    @Override
    public void drawFeathers() {
        System.out.println("Im drawing feathers");
    }

    @Override
    public void drawClaws() {
        System.out.println("Im drawing claws");
    }

    @Override
    public void feed() {
        System.out.println("Im feeding");
    }

    @Override
    public void born() {
        System.out.println(new Date());
    }
}
