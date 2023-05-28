
package ec.espe.edu.chickenfarm.model;

/**
 *
 * @author Michael Simbana, POO-ERATION GOSLING, ESPE-DCCO
 */
public class Egg {
    private int id;

    @Override
    public String toString() {
        return "Egg{" + "id=" + id + ", Plain=" + Plain + ", Java=" + Java + '}';
    }
    
    public Egg(int id) {
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
