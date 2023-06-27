package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Juan Rueda, The Encoders, DCCO-ESPE
 */
public class Pig extends FarmAnimal{

    @Override
    public boolean feed(Food food) {
        return true;
    }
       

    @Override
    public int produce() {
        return 50;
    }

    public Pig(int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
    }
    
}
