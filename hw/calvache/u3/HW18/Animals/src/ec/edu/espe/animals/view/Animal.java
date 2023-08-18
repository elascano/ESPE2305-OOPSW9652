
package ec.edu.espe.animals.view;

import ec.edu.espe.animals.model.Condor;
import ec.edu.espe.animals.model.Lion;
import ec.edu.espe.animals.model.Tiger;
import ec.edu.espe.animals.model.Tooth;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class Animal {
    public static void main(String[] args) {
        Tooth tooth = new Tooth();
        Tiger tiger = new Tiger();
        Condor condor = new Condor();
        Lion lion = new Lion(tooth);
        
        tiger.drawTeeth();
        condor.drawFeathers();
        lion.drawTeeth();
        
    }
}
