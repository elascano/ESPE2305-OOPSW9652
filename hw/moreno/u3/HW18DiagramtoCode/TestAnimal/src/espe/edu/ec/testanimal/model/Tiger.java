
package espe.edu.ec.testanimal.model;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class Tiger extends Mammal {

    @Override
    public void born() {
        System.out.println("The tiger Has born");
    }
    @Override
    public void feed(String typeOfFood){
        System.out.println("The Tiger is Eating"+ typeOfFood);
    }
    
    
}
