
package espe.edu.ec.testanimal.model;

import java.util.ArrayList;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public abstract class Bird extends Animal {
    ArrayList <Feather> feather = new ArrayList<>();
    Beak beak;
    @Override
    public void feed(String typeOfFood){
        
    }
}
