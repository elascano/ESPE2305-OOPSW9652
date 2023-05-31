package ec.edu.espe.chickenfarm.model;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
