package ec.edu.espe.composite.model;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class Manager extends Supervisor {
    public Manager(String aName){
        name = aName;
        title = "Manager";
    }
    
    public String stateName(){
        return super.stateName();
    }
}
