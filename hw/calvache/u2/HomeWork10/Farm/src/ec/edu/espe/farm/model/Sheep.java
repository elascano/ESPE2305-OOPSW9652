package ec.edu.espe.farm.model;

import ec.edu.espe.farm.model.FarmAnimal;
import ec.edu.espe.farm.model.Food;
import ec.edu.espe.farm.model.iWool;
import java.util.Date;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class Sheep extends FarmAnimal implements iWool {

    private Date lastSheering;
    private float getWool;

    public Sheep(Date lastSheering, float getWool, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
        this.getWool = getWool;
    }

    @Override
    public String toString() {
        return "Sheep--> " + super.toString() + ", Last Sheering: " + lastSheering + ", Obtained Wool: " + getWool + "kg";
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
    public float getWool() {
        return getWool;
    }

    public Date getLastSheering() {
        return lastSheering;
    }

    public void setLastSheering(Date lastSheering) {
        this.lastSheering = lastSheering;
    }

    public float getGetWool() {
        return getWool;
    }

    public void setGetWool(float getWool) {
        this.getWool = getWool;
    }

}
