/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractfactory.controller;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class MaintenFactory implements FactoryService{

    @Override
    public InformaticService createService() {
        return new MaintenService();
    }
    
}
