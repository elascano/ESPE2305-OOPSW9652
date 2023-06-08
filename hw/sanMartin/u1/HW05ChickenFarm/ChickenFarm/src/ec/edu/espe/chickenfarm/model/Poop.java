
package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class Poop {
    private int  id;

    public Poop(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Poop{" + "id=" + id + '}';
    }
    
}
