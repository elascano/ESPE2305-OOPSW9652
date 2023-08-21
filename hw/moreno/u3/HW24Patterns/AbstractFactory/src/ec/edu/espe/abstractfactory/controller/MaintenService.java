/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractfactory.controller;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class MaintenService implements InformaticService{

    @Override
    public String SetWork() {
        return "Ready to work";
    }

    @Override
    public String SetDate() {
        return "Ready to 18/08/2023";
    }

    @Override
    public String SetPayment() {
        return "transfer";
    }
    
}
