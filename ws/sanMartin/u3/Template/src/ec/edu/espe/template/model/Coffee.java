
package ec.edu.espe.template.model;

import ec.edu.espe.template.controller.HotBeverage;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public abstract class Coffee extends HotBeverage{

    void prepareIngredient() {
        System.out.println("Grinding coffee beans");
    }

    void addCondiments() {
        System.out.println("Adding sugar and milk to coffee");
    }

  
    
}
