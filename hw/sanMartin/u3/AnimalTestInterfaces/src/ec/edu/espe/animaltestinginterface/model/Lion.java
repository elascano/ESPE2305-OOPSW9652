
package ec.edu.espe.animaltestinginterface.model;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class Lion implements Mammal{

    

    @Override
    public String feed() {
       return "The lion es now Feed";
    }

    @Override
    public String born() {
        return "The Lion Has Born";
    }

    @Override
    public String drawTeeth() {
        return "The lion now has teeth";
    }

  
    
}
