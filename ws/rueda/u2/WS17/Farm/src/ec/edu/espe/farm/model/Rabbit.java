package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Juan Rueda, The Encoders, DCCO-ESPE
 */
public class Rabbit extends FarmAnimal implements IWool {
    private int layWool;

    public Rabbit(int layWool, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.layWool = layWool;
    }

    @Override
    public String toString() {
        return "Rabbit{" + "layWool=" + layWool + '}';
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
