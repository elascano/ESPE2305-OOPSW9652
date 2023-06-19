
package ec.edu.espe.model;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class Drink {
    private int id;
    private String brand;
    private float contentInMilimeters;
    private float percentagePerAlcohol;
    private float tax;

    public float getTax() {
        return tax;
    }

    public Drink(int id, String brand, float contentInMilimeters, float percentagePerAlcohol, float tax) {
        this.id = id;
        this.brand = brand;
        this.contentInMilimeters = contentInMilimeters;
        this.percentagePerAlcohol = percentagePerAlcohol;
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Drink{" + "id=" + id + ", brand=" + brand + ", contentInMilimeters=" + contentInMilimeters + ", percentagePerAlcohol=" + percentagePerAlcohol + ", tax=" + tax + '}';
    }

    public void setTax(float tax) {
        this.tax = tax;
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
     * @return the contentInMilimeters
     */
    public float getContentInMilimeters() {
        return contentInMilimeters;
    }

    /**
     * @param contentInMilimeters the contentInMilimeters to set
     */
    public void setContentInMilimeters(float contentInMilimeters) {
        this.contentInMilimeters = contentInMilimeters;
    }

    /**
     * @return the percentagePerAlcohol
     */
    public float getPercentagePerAlcohol() {
        return percentagePerAlcohol;
    }

    /**
     * @param percentagePerAlcohol the percentagePerAlcohol to set
     */
    public void setPercentagePerAlcohol(float percentagePerAlcohol) {
        this.percentagePerAlcohol = percentagePerAlcohol;
    }
    
}
