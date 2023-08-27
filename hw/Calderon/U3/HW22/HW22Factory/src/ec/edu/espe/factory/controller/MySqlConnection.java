package ec.edu.espe.factory.controller;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class MySqlConnection extends Connection{
    
    public MySqlConnection() {
    }
    public String description(){
        return "MySQL";
    }
}
