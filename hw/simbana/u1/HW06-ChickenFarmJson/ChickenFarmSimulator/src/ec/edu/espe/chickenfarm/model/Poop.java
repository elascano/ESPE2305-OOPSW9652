package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class Poop {
    private int id;

    @Override
    public String toString() {
        return "Poop{" + "id=" + id + '}';
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
