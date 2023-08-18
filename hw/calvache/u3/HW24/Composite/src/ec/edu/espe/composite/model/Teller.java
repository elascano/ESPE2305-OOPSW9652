package ec.edu.espe.composite.model;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class Teller extends Employee{
    public Teller(String aName){
        name = aName;
        title = "Teller";
    }
    
    public String stateName(){
        return super.stateName();
    }
}
