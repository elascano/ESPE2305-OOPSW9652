package ec.edu.espe.connection.model;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class MySqlConnection extends Connection{
    public MySqlConnection(){}
    @Override
    public String description(){
        return "MySQL";
    }
}
