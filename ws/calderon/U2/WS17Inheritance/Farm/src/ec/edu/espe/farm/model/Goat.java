
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class Goat extends FarmAnimal implements iMilk {
    
    private int milkProduce;

    public Goat(int milkProduce, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.milkProduce = milkProduce;
    }

    @Override
    public String toString() {
        return "Goat: " + super.toString() + ", milkProduce: " + milkProduce +" Liters";
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
        setMilkProduce(getMilkProduce() + 1);
    }

    public int getMilkProduce() {
        return milkProduce;
    }

    public void setMilkProduce(int milkProduce) {
        this.milkProduce = milkProduce;
    }
    
}
