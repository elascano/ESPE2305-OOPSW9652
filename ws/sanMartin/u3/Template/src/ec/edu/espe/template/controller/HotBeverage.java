
package ec.edu.espe.template.controller;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
abstract public class HotBeverage {
    final void prepareBeverage() {
        boilWater();
        prepareIngredient();
        pourIntoCup();
        addCondiments();
    }

    
    abstract void prepareIngredient();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourIntoCup() {
        System.out.println("Pouring into cup");
    }
}
