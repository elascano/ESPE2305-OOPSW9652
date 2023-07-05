package ec.edu.espe.shopper.model;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class Shopper {
    
    private int id;
    private String name;
    private String lastName;
    private float totalPay;

    public Shopper(int id, String name, String lastName, float totalPay) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.totalPay = totalPay;
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
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the totalPay
     */
    public float getTotalPay() {
        return totalPay;
    }

    /**
     * @param totalPay the totalPay to set
     */
    public void setTotalPay(float totalPay) {
        this.totalPay = totalPay;
    }

    @Override
    public String toString() {
        return "Shopper{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", totalPay=" + totalPay + '}';
    }
    
    
}
