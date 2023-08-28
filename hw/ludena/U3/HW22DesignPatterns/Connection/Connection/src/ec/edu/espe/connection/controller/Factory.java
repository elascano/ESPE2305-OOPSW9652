package ec.edu.espe.connection.controller;

import ec.edu.espe.connection.model.Connection;

/**
 *
 * @author Edison Ludeña, BugBusters, DCCO-ESPE
 */
public abstract class Factory {

    public Factory() {
    }

    public abstract Connection createConnection(String type);
}
