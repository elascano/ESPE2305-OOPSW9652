
package ec.edu.espe.shoes.model;

import ec.edu.espe.tax.SalesTax;

/**
 *
 * @author Your Name <your.name at your.org>
 */
public class PairOfShoes {
    int id;
    String brand;
    String model;
    float price;
    float totalPrice;

    @Override
    public String toString() {
        return "PairOfShoes{" + "id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + ", totalPrice=" + totalPrice + '}';
    }
    
    public PairOfShoes(int id, String brand, String model, float price, float totalPrice) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.totalPrice = totalPrice;
    }
    public PairOfShoes (int id, String brand, String model, float price){
    this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.totalPrice = SalesTax.computeIva(price, 12.0F);
         }
    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getPrice() {
        return price;
    }

    public float getTotalPrice() {
        return totalPrice;
    }
    
}
