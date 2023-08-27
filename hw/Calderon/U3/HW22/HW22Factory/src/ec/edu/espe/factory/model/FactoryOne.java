package ec.edu.espe.factory.model;

import ec.edu.espe.factory.controller.Connection;
import ec.edu.espe.factory.controller.MySqlConnection;
import ec.edu.espe.factory.controller.OracleConnection;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class FactoryOne extends Factory{
    
    public Connection createConnection(String type) { //Factory method
        if (type.equals("Oracle"))
            return new OracleConnection();
        else
            return new MySqlConnection();
    }
}
