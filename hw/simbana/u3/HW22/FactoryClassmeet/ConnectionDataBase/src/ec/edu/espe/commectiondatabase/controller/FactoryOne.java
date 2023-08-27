/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.commectiondatabase.controller;

import ec.edu.espe.commectiondatabase.model.MySQLConnection;
import ec.edu.espe.commectiondatabase.model.OracleConnection;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class FactoryOne extends Factory {
    @Override
    public Connection createConnection(String type) {
        if (type.equals("Oracle")) {
            return new OracleConnection();
        } else {
            return new MySQLConnection();
        }
    }
}
