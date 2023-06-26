
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class Chicken extends FarmAnimal implements IBird{
   private boolean isMolting;
    private int laidEggs;

    public Chicken(boolean isMolting, int laidEggs, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
        this.laidEggs = laidEggs;
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
    

    @Override
    public boolean feed(Food food) {
        //TODO Program Animal Feeding
        return true;
    }

    @Override
    public int produce() {
        //TODO program the number of chickens
        return 4;
    }

    @Override
    public String toString() {
        return "Chicken{" + "isMolting=" + isMolting + ", laidEggs=" + laidEggs + super.toString()+'}';
    }

    @Override
    public void layAnEgg() {
        laidEggs=laidEggs+1;
    }
    public int produce(Meat meat){
    
       return meat.getPounds();
    
    }
}
