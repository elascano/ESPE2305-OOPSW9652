package ec.edu.espe.factory.model;

import ec.edu.espe.factory.controller.Connection;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public abstract class Factory {
    
    public Factory() {  
    }
    public abstract Connection createConnection(String type); //Factory method
}
