
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Cow extends FarmAnimal {
    boolean isProducingMilk;

    public Cow(boolean isProducingMilk,int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isProducingMilk = isProducingMilk;
    }

    @Override
    public String toString() {
        return "\nisProducingMilk=" + isProducingMilk + super.toString();
    }

    
    
    @Override
    public boolean feed(Food food) {
        //TODO program animal feeding
        return true;
    }

    @Override
    public int produce() {
        return 7;
    }
    
    public int getLeatherForClothes(){
        return 9;
    }
    
}
