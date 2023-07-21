
package ec.edu.espe.q7100.model;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class Coomputer {
 
    private int id;
    private String color;
    private String brand;
    private float price;

    public Coomputer(int id, String color, String brand, float price) {
        this.id = id;
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" + "id=" + id + ", color=" + color + ", brand=" + brand + ", price=" + price + '}';
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }
    
}
