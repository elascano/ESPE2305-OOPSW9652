package ec.edu.espe.zoo.controller;

import ec.edu.espe.zoo.model.Claw;
import ec.edu.espe.zoo.model.Tooth;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public abstract class Mammal extends Animal {

    private ArrayList<Tooth> tooth;

    public Mammal(ArrayList<Tooth> tooth, Date bornOn, Claw[] claw) {
        super(bornOn, claw);
        this.tooth = tooth;
    }

    @Override
    public String toString() {
        return "Mammal{" + "tooth=" + tooth.toString() + '}';
    }

    @Override
    public abstract void feed();

    @Override
    public void born() {
        bornOn = new Date();
        System.out.println(bornOn);
    }

    public ArrayList<Tooth> getTooth() {
        return tooth;
    }

    public void setTooth(ArrayList<Tooth> tooth) {
        this.tooth = tooth;
    }
}
