package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class Cow extends FarmAnimal{
    private boolean isProducingMilk;

    public Cow(boolean isProducingMilk, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
    }

    @Override
    public String toString() {
        return "Cow{" + super.toString() + 
                "isProducingMilk=" + isProducingMilk + '}';
    }

    @Override
    public int produce() {
        return 2;
    }

    @Override
    public boolean feed(Food food) {
        return true;
    }

    /**
     * @return the isProducingMilk
     */
    public boolean isIsProducingMilk() {
        return isProducingMilk;
    }

    /**
     * @param isProducingMilk the isProducingMilk to set
     */
    public void setIsProducingMilk(boolean isProducingMilk) {
        this.isProducingMilk = isProducingMilk;
    }
}
