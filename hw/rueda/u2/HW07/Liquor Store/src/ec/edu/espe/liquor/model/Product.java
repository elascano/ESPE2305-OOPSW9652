package ec.edu.espe.liquor.model;

import ec.edu.espe.tax.SalesTax;

/**
 *
 * @author Juan Rueda, The Encoders, DCCO-ESPE
 */
public class Product {
    private String make;
    private float pricePerUnit;
    private int numberOfPackages;
    private int boxesPerPackage;
    private int unitsPerBox;
    private float taxes;
    private float totalCost;

    public Product(String make, float pricePerUnit, int numberOfPackages, int boxesPerPackage, int unitsPerBox, float taxes, float totalAndIce) {
        this.make = make;
        this.pricePerUnit = pricePerUnit;
        this.numberOfPackages = numberOfPackages;
        this.boxesPerPackage = boxesPerPackage;
        this.unitsPerBox = unitsPerBox;
        this.taxes = taxes;
        this.totalCost = SalesTax.computeIce(taxes, pricePerUnit, numberOfPackages, boxesPerPackage, unitsPerBox);
    }

    @Override
    public String toString() {
        return "Cigarrette{" + "make=" + getMake() + ", pricePerUnit=" + getPricePerUnit() + ", numberOfPackages=" + getNumberOfPackages() + ", boxesPerPackage=" + getBoxesPerPackage() + ", unitsPerBox=" + getUnitsPerBox() + ", taxes=" + getTaxes() + ", totalCost=" + getTotalCost() + '}';
    }

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the pricePerUnit
     */
    public float getPricePerUnit() {
        return pricePerUnit;
    }

    /**
     * @param pricePerUnit the pricePerUnit to set
     */
    public void setPricePerUnit(float pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    /**
     * @return the numberOfPackages
     */
    public int getNumberOfPackages() {
        return numberOfPackages;
    }

    /**
     * @param numberOfPackages the numberOfPackages to set
     */
    public void setNumberOfPackages(int numberOfPackages) {
        this.numberOfPackages = numberOfPackages;
    }

    /**
     * @return the boxesPerPackage
     */
    public int getBoxesPerPackage() {
        return boxesPerPackage;
    }

    /**
     * @param boxesPerPackage the boxesPerPackage to set
     */
    public void setBoxesPerPackage(int boxesPerPackage) {
        this.boxesPerPackage = boxesPerPackage;
    }

    /**
     * @return the unitsPerBox
     */
    public int getUnitsPerBox() {
        return unitsPerBox;
    }

    /**
     * @param unitsPerBox the unitsPerBox to set
     */
    public void setUnitsPerBox(int unitsPerBox) {
        this.unitsPerBox = unitsPerBox;
    }

    /**
     * @return the taxes
     */
    public float getTaxes() {
        return taxes;
    }

    /**
     * @param taxes the taxes to set
     */
    public void setTaxes(float taxes) {
        this.taxes = taxes;
    }

    /**
     * @return the totalCost
     */
    public float getTotalCost() {
        return totalCost;
    }

    /**
     * @param totalCost the totalCost to set
     */
    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }



}
