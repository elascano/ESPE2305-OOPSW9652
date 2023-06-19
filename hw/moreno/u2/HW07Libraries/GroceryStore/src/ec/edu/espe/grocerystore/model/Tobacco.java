
package ec.edu.espe.grocerystore.model;

import ec.edu.espe.tax.SalesTax;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class Tobacco {
    private String brand;
    private float price;
    private float totalPrice;

    public Tobacco(String brand, float price) {
        this.brand = brand;
        this.price = price;
        this.totalPrice = totalPrice =SalesTax.computeICEPercentage(price, 150, 12);
    }

    @Override
    public String toString() {
        return "brand=" + brand + "Unit Price=" + price + ", totalPrice=" + totalPrice + '\n';
    }

    
    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
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

    /**
     * @return the totalPrice
     */
    public float getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice the totalPrice to set
     */
    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    
}
