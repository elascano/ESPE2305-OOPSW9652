
package espe.edu.ec.testanimal.model;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
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
