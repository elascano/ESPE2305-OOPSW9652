package ec.edu.espe.taxsystem.model;

import com.bugbusters.tax.SalesTax;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class Product {
    int id;
    String productName;
    float pricePerUnit;
    int numberOfPackages;
    int boxesPerPackage;
    int unitsPerBox;
    float iceProduced;
    float totalPrice;

    public Product(int id, String productName, float pricePerUnit, int numberOfPackages, int boxesPerPackage, int unitsPerBox, float iceProduced, float totalPrice) {
        this.id = id;
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.numberOfPackages = numberOfPackages;
        this.boxesPerPackage = boxesPerPackage;
        this.unitsPerBox = unitsPerBox;
        this.iceProduced = iceProduced;
        this.totalPrice = SalesTax.computeIce(iceProduced, pricePerUnit, numberOfPackages, boxesPerPackage, unitsPerBox);
    }

    @Override
    public String toString() {
        return "-- Product{" + 
                "\n id=" + id + 
                "\n productName=" + productName + 
                "\n pricePerUnit=" + pricePerUnit + 
                "\n numberOfPackages=" + numberOfPackages +
                "\n boxesPerPackage=" + boxesPerPackage + 
                "\n unitsPerBox=" + unitsPerBox + 
                "\n iceProduced=" + iceProduced + 
                "\n totalPrice=" + totalPrice + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(float pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public int getNumberOfPackages() {
        return numberOfPackages;
    }

    public void setNumberOfPackages(int numberOfPackages) {
        this.numberOfPackages = numberOfPackages;
    }

    public int getBoxesPerPackage() {
        return boxesPerPackage;
    }

    public void setBoxesPerPackage(int boxesPerPackage) {
        this.boxesPerPackage = boxesPerPackage;
    }

    public int getUnitsPerBox() {
        return unitsPerBox;
    }

    public void setUnitsPerBox(int unitsPerBox) {
        this.unitsPerBox = unitsPerBox;
    }

    public float getIceProduced() {
        return iceProduced;
    }

    public void setIceProduced(float iceProduced) {
        this.iceProduced = iceProduced;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    
   
}
