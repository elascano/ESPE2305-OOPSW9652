
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class Cow extends FarmAnimal implements iMilk {
    
    private boolean isInHeat;
    private int milkProduce;

    public Cow(boolean isInHeat, int milkProduce, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isInHeat = isInHeat;
        this.milkProduce = milkProduce;
    }

    @Override
    public String toString() {
        return "Cow: " + super.toString() + ", isInHeat: " + isInHeat + ", milkProduce: " + milkProduce +" Liters";
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

    @Override
    public void generateMilk() {
        milkProduce = milkProduce +1;
    }
    
    public boolean isIsInHeat() {
        return isInHeat;
    }

    public void setIsInHeat(boolean isInHeat) {
        this.isInHeat = isInHeat;
    }

    public int getMilkProduce() {
        return milkProduce;
    }

    public void setMilkProduce(int milkProduce) {
        this.milkProduce = milkProduce;
    }
}
