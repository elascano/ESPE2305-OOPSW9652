package ec.edu.espe.connection.model;

/**
 *
 * @author Edison Ludeña, BugBusters, DCCO-ESPE
 */
public class MySqlConnection extends Connection {

    public MySqlConnection() {
    }

    public String description() {
        return "I'm connecting to MySQL";
    }
}
