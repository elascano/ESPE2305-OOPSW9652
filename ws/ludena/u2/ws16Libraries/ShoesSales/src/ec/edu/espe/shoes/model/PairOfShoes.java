package ec.edu.espe.shoes.model;

import com.bugbusters.tax.SalesTax;

/**
 *
 * @author LENOVO
 */
public class PairOfShoes {

    int id;
    String brand;
    String model;
    float price;
    float totalPrice;

    public PairOfShoes(int id, String make, String brand, float price, float totalPrice) {
        this.id = id;
        this.brand = make;
        this.model = brand;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    public PairOfShoes(int id, String make, String brand, float price) {
        this.id = id;
        this.brand = make;
        this.model = brand;
        this.price = price;
        this.totalPrice = SalesTax.computeIva(price, 12.0F);
    }

    @Override
    public String toString() {
        return "Shoes{" + "id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + ", totalPrice=" + totalPrice + '}';
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

    public String getModel() {
        return model;
    }

    public void setBrabd(String brand) {
        this.model = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    
    
}
