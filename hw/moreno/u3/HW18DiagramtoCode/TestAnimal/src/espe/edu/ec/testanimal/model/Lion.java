
package espe.edu.ec.testanimal.model;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class Lion extends Mammal {

    @Override
    public void born() {
        System.out.println("The Lion Has born");
    }
    
    
    @Override
    public void feed(String typeOfFood) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
