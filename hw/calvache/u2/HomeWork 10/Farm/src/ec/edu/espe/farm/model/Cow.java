package ec.edu.espe.farm.model;

import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Food;

import java.util.Date;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class Cow extends FarmAnimal {

    private boolean getLeather;
    private boolean isProducingMilk;

    public Cow(boolean getLeather, boolean milkProduce, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.getLeather = getLeather;
        this.isProducingMilk = milkProduce;
    }

    @Override
    public String toString() {
        return "Cow--> " + super.toString() + ", Leather: " + getLeather + ", Is Producing Milk: " + isProducingMilk;
    }

    @Override
    public boolean feed(Food food) {
        //TODO program animal feeding
        return true;
    }

    @Override
    public int produce() {
        //TODO program the number of cow
        return 2;
    }

    public boolean isIsInHeat() {
        return getLeather;
    }

    public void setIsInHeat(boolean isInHeat) {
        this.getLeather = isInHeat;
    }

    public boolean getMilkProduce() {
        return isProducingMilk;
    }

    public void setMilkProduce(boolean milkProduce) {
        this.isProducingMilk = milkProduce;
    }
}
