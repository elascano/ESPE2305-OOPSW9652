/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.commectiondatabase.model;

import ec.edu.espe.commectiondatabase.controller.Connection;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class OracleConnection extends Connection {

    public OracleConnection() {

    }
    
    @Override
    public String description() {
        return "Oracle";
    }

}
