package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Juan Rueda, The Encoders, DCCO-ESPE
 */
public class Sheep extends FarmAnimal implements IWool{
    
    private boolean lastSheering;
    private int layWool;

    public Sheep(boolean lastSheering, int layWool, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.lastSheering = lastSheering;
        this.layWool = layWool;
    }

    @Override
    public String toString() {
        return "Sheep{" + "lastSheering=" + lastSheering + ", layWool=" + layWool + '}';
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
    public void layWool() {
        setLayWool(getLayWool() + 1);
    }

    /**
     * @return the lastSheering
     */
    public boolean isLastSheering() {
        return lastSheering;
    }

    /**
     * @param lastSheering the lastSheering to set
     */
    public void setLastSheering(boolean lastSheering) {
        this.lastSheering = lastSheering;
    }

    /**
     * @return the layWool
     */
    public int getLayWool() {
        return layWool;
    }

    /**
     * @param layWool the layWool to set
     */
    public void setLayWool(int layWool) {
        this.layWool = layWool;
    }
    
    
}
