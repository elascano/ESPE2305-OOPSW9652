
package edu.ec.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class Sheep extends FarmAnimal{
    private Date lastSheering;

    public Sheep(Date lastSheering, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
    }

    @Override
    public String toString() {
        return "Sheep{"+ super.toString() + "lastSheering=" + lastSheering + '}';
    }

    /**
     * @return the lastSheering
     */
    public Date getLastSheering() {
        return lastSheering;
    }

    /**
     * @param lastSheering the lastSheering to set
     */
    public void setLastSheering(Date lastSheering) {
        this.lastSheering = lastSheering;
    }

    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 1;
    }
    
}
