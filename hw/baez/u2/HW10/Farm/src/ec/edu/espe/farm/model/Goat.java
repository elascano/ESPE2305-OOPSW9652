package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class Goat extends FarmAnimal{
    private boolean climb;

    public Goat(boolean climb, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.climb = climb;
    }

    @Override
    public String toString() {
        return "Goat{" + super.toString() + 
                "climb=" + isClimb() + '}';
    }
    
    @Override
    public int produce() {
        return 0;
    }

    @Override
    public boolean feed(Food food) {
        return true;
    }

    /**
     * @return the climb
     */
    public boolean isClimb() {
        return climb;
    }

    /**
     * @param climb the climb to set
     */
    public void setClimb(boolean climb) {
        this.climb = climb;
    }
    
}
