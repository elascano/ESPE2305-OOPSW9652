
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class Turkey extends FarmAnimal implements IBird{
    
    private boolean isMolting;
    private int laidEggs;

    public Turkey(boolean isMolting, int laidEggs, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
        this.laidEggs = laidEggs;
    }
    
    @Override
    public boolean feed(Food food) {
        //TODO program animal feeding
        return true;
    }

    @Override
    public int produce() {
        return 6;
    }

    @Override
    public void layAnEgg() {
        setLaidEggs(getLaidEggs() + 1);
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
}
