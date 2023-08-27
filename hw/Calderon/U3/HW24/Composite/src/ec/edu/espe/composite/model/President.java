package ec.edu.espe.composite.model;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class President extends Supervisor{
    
    public President(String aName){
        name = aName;
        title = "President";
    }
    
    public String stateName(){
        return super.stateName();
    }
    
}
