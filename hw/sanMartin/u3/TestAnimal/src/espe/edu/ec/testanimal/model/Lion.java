
package espe.edu.ec.testanimal.model;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
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
