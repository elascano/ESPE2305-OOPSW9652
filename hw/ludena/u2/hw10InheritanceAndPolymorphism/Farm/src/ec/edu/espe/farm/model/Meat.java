
package ec.edu.espe.farm.model;

/**
 *
 * @author LENOVO
 */
public class Meat {
    private int pounds;

    @Override
    public String toString() {
        return "Meat{" + "pounds=" + pounds + '}';
    }

    
    public int getPounds() {
        return pounds;
    }

    public void setPounds(int pounds) {
        this.pounds = pounds;
    }
    
    
}
