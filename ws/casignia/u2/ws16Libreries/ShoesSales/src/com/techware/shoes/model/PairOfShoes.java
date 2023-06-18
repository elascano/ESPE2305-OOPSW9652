package com.techware.shoes.model;

import com.techware.tax.SalesTax;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class PairOfShoes {
    int id;
    String brand;
    String model;
    float price;
    float totalPrice;

    @Override
    public String toString() {
        return "Shoe{" + "id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + ", totalPrice=" + totalPrice + '}';
    }

    public PairOfShoes(int id, String brand, String model, float price, float totalPrice) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.totalPrice = totalPrice;
    }
    
    public PairOfShoes(int id, String brand, String model, float price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.totalPrice = totalPrice = SalesTax.computeIva(price, 12.0F);
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

    public void setModel(String model) {
        this.model = model;
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
