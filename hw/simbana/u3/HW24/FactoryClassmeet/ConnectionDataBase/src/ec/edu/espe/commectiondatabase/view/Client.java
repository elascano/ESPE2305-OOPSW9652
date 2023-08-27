/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.commectiondatabase.view;

import ec.edu.espe.commectiondatabase.controller.Connection;
import ec.edu.espe.commectiondatabase.controller.Factory;
import ec.edu.espe.commectiondatabase.controller.FactoryOne;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new FactoryOne();
        Connection connection = factory.createConnection("Oracle");
        System.out.println("You are connecting with " + connection.description());
    }
}