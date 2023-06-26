
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class Turkey extends FarmAnimal implements IBird {
    private boolean isMolting;
    private int laidEggs;

    public Turkey(boolean isMolting, int laidEggs, int id, String breed, Date bornOn) {
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
        this.laidEggs = laidEggs+1;
    }

    @Override
    public String toString() {
        return "Turkey{" + "isMolting=" + isMolting + ", laidEggs=" + laidEggs + super.toString()+'}';
    }
    
    
    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 4;
    }

    @Override
    public void layAnEgg() {
        laidEggs=laidEggs+1;
    }
    public int produce(Meat meat){    
       return meat.getPounds();
    
    }
}
