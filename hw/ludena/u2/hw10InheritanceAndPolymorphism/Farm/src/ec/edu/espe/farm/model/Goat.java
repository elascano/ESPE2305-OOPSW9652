
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Goat extends FarmAnimal implements iOvine{
    Date lastSheering;

    public Goat(Date lastSheering,int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
    }

    @Override
    public String toString() {
        return "\nlastSheering=" + lastSheering + super.toString();
    }

    
    
    @Override
    public boolean feed(Food food) {
        //TODO program animal feeding
        return true;
    }

    @Override
    public int produce() {
        return 8;
    }

    @Override
    public Date sheer() {
        return new Date();
    }

    public Date getLastSheering() {
        return lastSheering;
    }

    public void setLastSheering(Date lastSheering) {
        this.lastSheering = lastSheering;
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
    
    
}
