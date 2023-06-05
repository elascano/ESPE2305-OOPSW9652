package ec.edu.espe.chickenfarmhomework.model;

/**
 *
 * @author Juan Rueda, The Javas, DCCO-ESPE
 */
public class Egg {
    private int egg;

    @Override
    public String toString() {
        return "Egg{" + "egg=" + egg + '}';
    }

    public Egg(int egg) {
        this.egg = egg;
    }

    /**
     * @return the egg
     */
    public int getEgg() {
        return egg;
    }

    /**
     * @param egg the egg to set
     */
    public void setEgg(int egg) {
        this.egg = egg;
    }
    
    
}
