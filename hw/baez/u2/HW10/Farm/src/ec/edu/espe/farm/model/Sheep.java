package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class Sheep extends FarmAnimal implements IWoolly{
    private Date lastsheeping;
    private int sheered;

    public Sheep(Date lastsheeping, int sheered, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.lastsheeping = lastsheeping;
        this.sheered = sheered;
    }

    
    
    @Override
    public String toString() {
        return "Sheep{" + super.toString() + 
                "lastsheeping=" + getLastsheeping() + '}';
    }

    @Override
    public int produce() {
        return 60;
    }

    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public void sheer() {
        sheered = sheered +1;
    }

    /**
     * @return the lastsheeping
     */
    public Date getLastsheeping() {
        return lastsheeping;
    }

    /**
     * @param lastsheeping the lastsheeping to set
     */
    public void setLastsheeping(Date lastsheeping) {
        this.lastsheeping = lastsheeping;
    }

    /**
     * @return the sheered
     */
    public int getSheered() {
        return sheered;
    }

    /**
     * @param sheered the sheered to set
     */
    public void setSheered(int sheered) {
        this.sheered = sheered;
    }
    
}
