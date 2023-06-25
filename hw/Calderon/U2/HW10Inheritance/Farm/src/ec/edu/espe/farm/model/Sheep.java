
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class Sheep extends FarmAnimal implements iWool{
 
    private Date lastSheering;
    private float woolDistance;

    public Sheep(Date lastSheering, float woolDistance, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
        this.woolDistance = woolDistance;
    }

    @Override
    public String toString() {
        return "Sheep: " + super.toString() + ", lastSheering: " + lastSheering + ", woolDistance: " + woolDistance + "meters";
    }
    
    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 1;
    }
    
    @Override
    public float makeWool() {
        return woolDistance;
    }

    public Date getLastSheering() {
        return lastSheering;
    }

    public void setLastSheering(Date lastSheering) {
        this.lastSheering = lastSheering;
    }


    public float getWoolDistance() {
        return woolDistance;
    }

    public void setWoolDistance(float woolDistance) {
        this.woolDistance = woolDistance;
    }
    
}
