package edu.ec.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class Turkey extends FarmAnimal implements IBird {
    private boolean isMolting;
    private int laidEggs;
    

    
    
    
    public Turkey(boolean isMolting, int layAnEggs, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.isMolting = isMolting;
        this.laidEggs = layAnEggs;
        
    }

    @Override
    public String toString() {
        return "Turkey{"+ super.toString() 
                + "isMolting=" + isMolting + ", layAnEggs=" + laidEggs + '}';
    }



    
    
    public int getLayAnEggs() {
        return laidEggs;
    }

    public void setLayAnEggs(int layAnEggs) {
        this.laidEggs = layAnEggs;
    }

    public boolean isIsMolting() {
        return isMolting;
    }

    public void setIsMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public int produce() {
        return 3;
    }

    @Override
    public void layAnEgg() {
        laidEggs = laidEggs + 1;
    }
    
    
}
