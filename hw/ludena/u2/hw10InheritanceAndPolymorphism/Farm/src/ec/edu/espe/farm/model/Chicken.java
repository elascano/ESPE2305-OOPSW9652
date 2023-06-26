
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Chicken extends FarmAnimal implements iBird{
    boolean isMolting;
    int laidEggs;

    public Chicken( boolean isMolting, int laidEggs, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
        this.laidEggs = laidEggs;
    }

    @Override
    public String toString() {
        return "\nisMolting= " + isMolting + "\nlaidEggs= " + laidEggs + super.toString();
    }
    
    @Override
    public void layAnEgg() {
       laidEggs = laidEggs + 1;
    }

    @Override
    public boolean feed(Food food) {
        //TODO program animal feeding
        return true;
    }

    @Override
    public int produce() {
    return 4;
    }
    
    public int produce(Meat meat){
        return meat.getPounds();
    }
            
    public boolean isIsMolting() {
        return isMolting;
    }

    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    public int getLaidEggs() {
        return laidEggs;
    }

    public void setLaidEggs(int laidEggs) {
        this.laidEggs = laidEggs;
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
