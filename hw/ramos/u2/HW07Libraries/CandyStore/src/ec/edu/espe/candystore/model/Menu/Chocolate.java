
package ec.edu.espe.candystore.model.Menu;

import ec.edu.espe.tax.SalesTax;






/**
 *
 * @author Your Name <your.name at your.org>
 */
public class Chocolate {
    private String brand;
    private float unitPrice;
    private float totalPrice;

    public Chocolate(String brand, float unitPrice, float totalPrice) {
        this.brand = brand;
        this.unitPrice = unitPrice;
        totalPrice= totalPrice= SalesTax.computeICEAssign(unitPrice, 0.16F, 12);
    }

    public Chocolate(String galak, float f) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
     * @return the unitPrice
     */
    public float getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
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
