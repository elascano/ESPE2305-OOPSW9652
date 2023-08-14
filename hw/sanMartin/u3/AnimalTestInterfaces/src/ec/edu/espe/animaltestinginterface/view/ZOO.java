package ec.edu.espe.animaltestinginterface.view;

import ec.edu.espe.animaltestinginterface.model.Lion;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class ZOO {

    public static void main(String[] args) {
        Lion lion = new Lion();
        System.out.println(lion.born());
        System.out.println(lion.drawTeeth());
        System.out.println(lion.feed());
    }
}
