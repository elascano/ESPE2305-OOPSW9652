
package espe.edu.ec.testanimal.model;

import java.util.ArrayList;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public abstract class Mammal extends Animal{
    
    ArrayList <Tooth> tooth = new ArrayList<>();
    @Override
    public abstract void feed(String typeOfFood);
    
    @Override
    public void born(){
        
    }
}
