
package ec.edu.espe.grocerystore.model;

import ec.edu.espe.tax.SalesTax;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class PackOfCigarrette {
    private String brand;
    private float unitPrice;
    private float totalPrice;

    public PackOfCigarrette(String brand, float unitPrice) {
        this.brand = brand;
        this.unitPrice = unitPrice;
        this.totalPrice= totalPrice= SalesTax.computeICEAssign(unitPrice, 0.16F, 12);
    }

    @Override
    public String toString() {
        return "brand=" + brand + ", unitPrice=" + unitPrice + ", totalPrice=" + totalPrice + '\n';
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
