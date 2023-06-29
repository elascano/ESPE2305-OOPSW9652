package ec.edu.espe.makeupsystem.model;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class MakeupProduct {
    private String product;
    private int id;
    private String color;
    private float price;

    public MakeupProduct(String product, int id, String color, float price) {
        this.product = product;
        this.id = id;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MakeupProduct{" + "product=" + product + 
                ", id=" + id + ", color=" + color + ", price=" + price + '}';
    }
    
    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
    
    
}
