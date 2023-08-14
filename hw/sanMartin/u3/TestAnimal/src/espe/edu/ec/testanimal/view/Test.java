
package espe.edu.ec.testanimal.view;

import espe.edu.ec.testanimal.model.Lion;
import espe.edu.ec.testanimal.model.Mammal;
import espe.edu.ec.testanimal.model.Tiger;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class Test {
    public static void main(String[] args) {
        Mammal m = new Lion();
        Mammal m2 = new Tiger();
        m.born();
        m2.born();
    }
}
