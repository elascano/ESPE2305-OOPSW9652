
package espe.edu.ec.testanimal.model;

import java.util.ArrayList;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public abstract class Bird extends Animal {
    ArrayList <Feather> feather = new ArrayList<>();
    Beak beak;
    @Override
    public void feed(String typeOfFood){
        
    }
}
