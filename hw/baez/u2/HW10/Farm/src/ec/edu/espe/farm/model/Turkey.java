package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class Turkey extends FarmAnimal implements IBird{
    private int laideggs;

    public Turkey(int laideggs, int id, String breed, Date bornOn) {
        super(id, breed, bornOn);
        this.laideggs = laideggs;
    }

    @Override
    public String toString() {
        return "Turkey{" + super.toString() +
                "laideggs=" + getLaideggs() + '}';
    }

    @Override
    public int produce() {
        return 1;
    }

    @Override
    public boolean feed(Food food) {
        return true;
    }

    @Override
    public void layAnEgg() {
        laideggs = laideggs+1;
    }

    /**
     * @return the laideggs
     */
    public int getLaideggs() {
        return laideggs;
    }

    /**
     * @param laideggs the laideggs to set
     */
    public void setLaideggs(int laideggs) {
        this.laideggs = laideggs;
    }
    
}
