package ec.edu.espe.factory.controller;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class MySqlConnection extends Connection{
    
    public MySqlConnection() {
    }
    public String description(){
        return "MySQL";
    }
}
