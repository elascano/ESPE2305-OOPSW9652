package ec.edu.espe.sportstore.model;

/**
 *
 * @author Cesar Galarza, BugBusters, DCCO-ESPE
 */
public class Sport {

    private int id;
    private String name;
    private boolean useBall;

    @Override
    public String toString() {
        return "Sport{" + "id=" + id + ", name=" + name + ", useBall=" + useBall + '}';
    }

    public Sport(int id, String name, boolean useBall) {
        this.id = id;
        this.name = name;
        this.useBall = useBall;
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

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the useBall
     */
    public boolean isUseBall() {
        return useBall;
    }

    /**
     * @param useBall the useBall to set
     */
    public void setUseBall(boolean useBall) {
        this.useBall = useBall;
    }
}
