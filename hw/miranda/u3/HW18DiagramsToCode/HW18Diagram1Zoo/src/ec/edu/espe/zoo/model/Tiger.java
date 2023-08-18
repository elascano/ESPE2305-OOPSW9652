package ec.edu.espe.zoo.model;

import ec.edu.espe.zoo.controller.Mammal;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class Tiger implements Mammal{
    
    private Tooth teeth;

    public Tiger(Tooth teeth) {
        this.teeth = teeth;
    }
    
    @Override
    public void drawTeeth() {
        //TODO
    }

    @Override
    public void feed() {
        //TODO
    }

    @Override
    public void born() {
        //TODO
    }

    /**
     * @return the teeth
     */
    public Tooth getTeeth() {
        return teeth;
    }

    /**
     * @param teeth the teeth to set
     */
    public void setTeeth(Tooth teeth) {
        this.teeth = teeth;
    }
    
}
