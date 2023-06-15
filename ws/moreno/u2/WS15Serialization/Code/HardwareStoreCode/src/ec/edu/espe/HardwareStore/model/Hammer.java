
package ec.edu.espe.HardwareStore.model;

import java.io.Serializable;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class Hammer implements Serializable {
    private String id;
    private String name;
    private String brand;
    private float cost;

    public Hammer(String id, String name, String brand, float price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.cost = price;
    }

    @Override
    public String toString() {
        return "Hammer{" + "id=" + id + ", name=" + name + ", brand=" + brand + ", price=" + cost + '}';
    }
    

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
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
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return cost;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.cost = price;
    }
}
