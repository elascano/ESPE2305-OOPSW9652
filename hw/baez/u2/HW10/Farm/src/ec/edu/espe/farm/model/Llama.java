package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class Llama extends FarmAnimal implements IWoolly{
    private int sheer;
    private boolean spit;
    
    
    
    public Llama(int sheer, boolean spit, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.sheer = sheer;
        this.spit = spit;
    }

    @Override
    public String toString() {
        return "Llama{" + super.toString() + 
                "sheer=" + sheer + ", spit=" + spit + '}';
    }

    @Override
    public int produce() {
        return 50;
    }

    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public void sheer() {
        setSheer(getSheer() + 1);
    }

    /**
     * @return the sheer
     */
    public int getSheer() {
        return sheer;
    }

    /**
     * @param sheer the sheer to set
     */
    public void setSheer(int sheer) {
        this.sheer = sheer;
    }

    /**
     * @return the spit
     */
    public boolean isSpit() {
        return spit;
    }

    /**
     * @param spit the spit to set
     */
    public void setSpit(boolean spit) {
        this.spit = spit;
    }
    
}
