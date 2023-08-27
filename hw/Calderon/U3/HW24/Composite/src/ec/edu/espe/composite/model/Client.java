package ec.edu.espe.composite.model;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class Client {
    public static Employee employee;
    
    public static String doClientTasks(){
        return employee.stateName();
    }
}
