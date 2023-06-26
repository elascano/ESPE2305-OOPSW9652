package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class Sheep extends FarmAnimal implements IWhool {
    private Date lastSheering;
    private int laidWhool;

    public Sheep(Date lastSheering, int laidWhool, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
        this.laidWhool = laidWhool;
    }

    @Override
    public String toString() {
        return "Sheep:" + super.toString()+
                " lastSheering=" + lastSheering + ", laidWhool=" + laidWhool + '}';
    }

    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 50;
    }

    @Override
    public void sheer() {
        laidWhool = laidWhool +1;
    }

    
    
}
