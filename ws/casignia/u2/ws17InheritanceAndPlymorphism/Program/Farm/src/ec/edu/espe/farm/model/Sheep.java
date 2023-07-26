package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class Sheep extends FarmAnimal{
    Date lastSheering;

    public Sheep(Date lastSheering, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
    }

    @Override
    public String toString() {
        return "Sheep" + "\nlast Sheering: " + lastSheering + "\n";
    }
    
    @Override
    public boolean feed(Food food){
        return true;
    }
    
    @Override
    public int produce(){
        return 10;
    }
}
