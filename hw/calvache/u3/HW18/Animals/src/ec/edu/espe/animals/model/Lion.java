package ec.edu.espe.animals.model;

import ec.edu.espe.animals.controller.Mammal;
import java.util.Date;

/**
 *
 *@author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class Lion implements Mammal {

    Tooth tooth;

    public Lion(Tooth tooth) {
        this.tooth = tooth;
    }

    @Override
    public String toString() {
        return "Lion{" + "tooth=" + tooth + '}';
    }

    @Override
    public void drawTeeth() {
        System.out.println("Im drawing " + tooth);
    }

    @Override
    public void feed() {
        System.out.println("Im feeding");
    }

    @Override
    public void born() {
        System.out.println(new Date());
    }

    public Tooth getTooth() {
        return tooth;
    }

    public void setTooth(Tooth tooth) {
        this.tooth = tooth;
    }
}
