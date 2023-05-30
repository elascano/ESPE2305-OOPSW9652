package ec.edu.espe.chickenfarm.model;
/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 * @version chicken farmer V0.1
 * 
 */
public class Egg {
    private int id;

    @Override
    public String toString() {
        return "Egg{" + "id=" + id + '}';
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
