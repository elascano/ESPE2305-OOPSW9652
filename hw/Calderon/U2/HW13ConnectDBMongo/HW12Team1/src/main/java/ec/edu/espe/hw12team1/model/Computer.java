package ec.edu.espe.hw12team1.model;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class Computer {

    private int id;
    private String brand;
    private String color;
    private float price;

    public Computer(int id, String brand, String color, float price) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nComputer " + "\nid: " + id + ", brand: " + brand + ", color: " + color + ", price: " + price;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
