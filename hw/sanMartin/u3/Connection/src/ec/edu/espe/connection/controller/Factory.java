package ec.edu.espe.connection.controller;

import ec.edu.espe.connection.model.Connection;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public abstract class Factory {
    public Factory(){}
    public abstract Connection createConnection(String type);
}
