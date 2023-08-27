
package ec.edu.espe.zoo.model;

import ec.edu.espe.zoo.controller.Animal;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public abstract class Bird extends Animal{
    
    private ArrayList<Feather> feather;
    Beak beak;
    
    public Bird(Date bornOn, Claw[] claw) {
        super(bornOn, claw);
        this.beak = beak;
        this.feather = feather;
    }

    @Override
    public abstract void feed();

    @Override
    public void born(){
        bornOn = new Date();
        System.out.println(bornOn);
    }

    public ArrayList<Feather> getFeather() {
        return feather;
    }

    public void setFeather(ArrayList<Feather> feather) {
        this.feather = feather;
    }

    public Beak getBeak() {
        return beak;
    }

    public void setBeak(Beak beak) {
        this.beak = beak;
    }

    public Date getBornOn() {
        return bornOn;
    }

    public void setBornOn(Date bornOn) {
        this.bornOn = bornOn;
    }
    
    
}
