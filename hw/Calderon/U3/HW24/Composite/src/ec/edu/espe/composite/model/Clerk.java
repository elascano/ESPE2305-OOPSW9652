package ec.edu.espe.composite.model;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class Clerk extends Employee{
    public Clerk(String aName){
        name = aName;
        title = "Clerk";
    }
    
    public String stateName(){
        return super.stateName();
    }
}
