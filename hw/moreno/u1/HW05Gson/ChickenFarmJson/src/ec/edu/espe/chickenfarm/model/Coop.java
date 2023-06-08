package ec.edu.espe.chickenfarm.model;

import java.util.ArrayList;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class Coop {
    private int id;
    private ArrayList<Chicken> chickens;

    @Override
    public String toString() {
        return "Coop\n" + "id=" + id + "\nchickens=" + chickens + '\n';
    }

    public Coop(int id, ArrayList<Chicken> chickens) {
        this.id = id;
        this.chickens = chickens;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }
}
