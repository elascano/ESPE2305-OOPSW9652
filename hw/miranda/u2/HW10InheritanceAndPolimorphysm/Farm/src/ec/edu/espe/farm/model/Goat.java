package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class Goat extends FarmAnimal implements IMammal{
    private boolean isProducingMilk;
    private int laidMilk;

    public Goat(boolean isProducingMilk, int laidMilk, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
        this.laidMilk = laidMilk;
    }

    @Override
    public String toString() {
        return "Goat{" + super.toString()+ 
                "isProducingMilk=" + isProducingMilk + ", laidMilk=" + laidMilk + '}';
    }
    

    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 7;
    }

    @Override
    public void produceMilk() {
        laidMilk = laidMilk +1;
    }
    
}
