
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class Eggs {
    
    private int egg;

    @Override
    public String toString() {
        return "Eggs{" + "egg=" + egg + '}';
    }

    public Eggs(int egg) {
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
