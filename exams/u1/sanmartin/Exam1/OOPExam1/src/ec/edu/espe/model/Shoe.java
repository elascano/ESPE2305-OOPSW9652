
package ec.edu.espe.model;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class Shoe {
    private int id;
    private String brand;
    private int size;

    @Override
    public String toString() {
        return "Shoe{" + "id=" + id + ", brand=" + brand + ", size=" + size + '}';
    }

    public Shoe(int id, String brand, int size) {
        this.id = id;
        this.brand = brand;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

 
}
