package ec.edu.espe.composite.model;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
abstract class Employee {
    String name = "Not assigned yet";
    String title = "Not assigned yet";
    
    public String stateName(){
        return title + ": " + name + "\n";
    }
}
