
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class Egg {
    private int egg;

    public Egg(int egg) {
        this.egg = egg;
    }

    @Override
    public String toString() {
        return "Egg{" + "egg=" + egg + '}';
    }
    

    public int getEgg() {
        return egg;
    }

    public void setEgg(int egg) {
        this.egg = egg;
    }
    
}
