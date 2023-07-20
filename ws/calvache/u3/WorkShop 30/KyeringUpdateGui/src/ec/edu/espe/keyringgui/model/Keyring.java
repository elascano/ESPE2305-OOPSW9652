
package ec.edu.espe.keyringgui.model;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class Keyring {
    private int id;
    private String color;
   private float price;

    public Keyring(int id, String model, float stock) {
        this.id = id;
        this.color = model;
        this.price = stock;
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
