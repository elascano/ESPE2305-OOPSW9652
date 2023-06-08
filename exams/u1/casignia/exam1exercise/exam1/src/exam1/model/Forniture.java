package exam1.model;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class Forniture {
    private int id;
    private float price;
    private String stock;

    @Override
    public String toString() {
        return "\n\tID: " + id + "\n\tPrice: " + price + "\n\tStock=" + stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String isStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public Forniture(int id, float price, String stock) {
        this.id = id;
        this.price = price;
        this.stock = stock;
    }
    
}
