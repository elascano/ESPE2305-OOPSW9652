package ec.edu.espe.templatemethod.model;

/**
 *
 * @author LENOVO
 */
public abstract class CaffeineBeverage {

    private String recipe;
    private String boilWater;
    private String pour;

    public CaffeineBeverage(String recipe, String boilWater, String pour) {
        this.recipe = recipe;
        this.boilWater = boilWater;
        this.pour = pour;
    }

    
    
    public void prepareRecipe() {
        recipe = "Preparing Recipe";
    }

    public void boilWater() {
        boilWater = "Boiling Water";
    }

    public abstract void brew();

    public void pourInCup() {
        pour = "Pouring Coffe";
    }

    public abstract void addCondiments();

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public String getBoilWater() {
        return boilWater;
    }

    public void setBoilWater(String boilWater) {
        this.boilWater = boilWater;
    }

    public String getPour() {
        return pour;
    }

    public void setPour(String pour) {
        this.pour = pour;
    }
}
