
package ec.edu.espe.perfume.model;

/**
 *
 * @author LENOVO
 */
public class Perfume {
    private String name;
    private String brand;
    private String id;
    private float price;
    private float totalPrice;

    public Perfume(String name, String brand, String id, float price, float totalPrice) {
        this.name = name;
        this.brand = brand;
        this.id = id;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "\n name=" + name + "\n brand=" + brand + "\n id=" + id + "\n price=" 
                + price + "\n totalPrice=" + totalPrice ;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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


    
    

