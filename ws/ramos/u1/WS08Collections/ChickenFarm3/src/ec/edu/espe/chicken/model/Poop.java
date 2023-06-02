package ec.edu.espe.chicken.model;

/**
 *
 * @author Your Name <your.name at your.org>
 */
public class Poop {
    private int id;

    public Poop(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Poop{" + "id=" + id + '}';
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
