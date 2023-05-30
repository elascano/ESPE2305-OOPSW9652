
package ec.edu.espe.chickenfarm3.model;

/**
 *
 * @author PabloEZurita
 */
public class Poop {
        private int id;

    @Override
    public String toString() {
        return "Poop{" + "id=" + getId() + '}';
    }
        
    public Poop(int id) {
        this.id = id;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
        
}
