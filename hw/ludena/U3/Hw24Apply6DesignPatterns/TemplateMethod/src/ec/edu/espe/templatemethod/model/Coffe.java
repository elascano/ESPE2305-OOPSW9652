package ec.edu.espe.templatemethod.model;

/**
 *
 * @author LENOVO
 */
public class Coffe extends CaffeineBeverage {

    private String brew;
    private String condiments;

    public Coffe(String recipe, String boilWater, String pour, String brew, String condiments) {
        super(recipe, boilWater, pour);
        this.brew = brew;
        this.condiments = condiments;
    }

    @Override
    public void brew() {
        brew = "Adding brew";
    }

    @Override
    public void addCondiments() {
        condiments = "Adding condiments";
    }

    public String getBrew() {
        return brew;
    }

    public void setBrew(String brew) {
        this.brew = brew;
    }

    public String getCondiments() {
        return condiments;
    }

    public void setCondiments(String condiments) {
        this.condiments = condiments;
    }

}
