package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class Horse extends FarmAnimal {

    float carryLoad;

    public Horse(float carryLoad, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.carryLoad = carryLoad;
    }

    @Override
    public String toString() {
        return "Horse--> " + super.toString() + ", Weight of the load=" + carryLoad + "kg";
    }

    public float getCarryLoad() {
        return carryLoad;
    }

    public void setCarryLoad(float carryLoad) {
        this.carryLoad = carryLoad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Date getBornOn() {
        return bornOn;
    }

    public void setBornOn(Date bornOn) {
        this.bornOn = bornOn;
    }

    @Override
    public boolean feed(Food food) {
        //TODO program animal feeding
        return true;
    }

    @Override
    public int produce() {
        //TODO program the number of horse
        return 3;
    }

}
