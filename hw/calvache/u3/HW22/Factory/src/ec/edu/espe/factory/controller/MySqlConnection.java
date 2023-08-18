package ec.edu.espe.factory.controller;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class MySqlConnection extends Connection{
    
    public MySqlConnection() {
    }
    public String description(){
        return "MySQL";
    }
}
