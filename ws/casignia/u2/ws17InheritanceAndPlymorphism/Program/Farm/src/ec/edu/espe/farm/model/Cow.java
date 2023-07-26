package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class Cow extends FarmAnimal{
    boolean inProducingMilk;

    public Cow(boolean inProducingMilk, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.inProducingMilk = inProducingMilk;
    }

    @Override
    public String toString() {
        return "Cow" + "\nin Producing Milk: " + inProducingMilk + "\n";
    }
    
    @Override
    public boolean feed(Food food){
        return true;
    }
    
    @Override
    public int produce(){
        return 50;
    }
}
