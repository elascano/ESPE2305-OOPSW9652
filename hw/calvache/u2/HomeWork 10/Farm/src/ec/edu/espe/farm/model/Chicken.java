package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class Chicken extends FarmAnimal implements IBird{

    boolean isMolting;
    int laidEggs;

    public Chicken(boolean isMolting, int laidEggs, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
        this.laidEggs = laidEggs;
    }

    @Override
    public String toString() {
        return "Chicken--> " + super.toString() + "Is Molting=" + isMolting + ", Numer of Laid Eggs=" + laidEggs;
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

    @Override
    public boolean feed(Food food) {
        //TODO program animal feeding;
        return true;
    }

    @Override
    public int produce() {
        //TODO program the number of chikens
        return 4;
    }

    @Override
    public void layAnEgg() {
        laidEggs=laidEggs+1;
    }
    public int produce(Meat meat){
        return meat.getPounds(1);
    }
}
