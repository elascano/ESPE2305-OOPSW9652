/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.observer.model;

/**
 *
 * @author LENOVO
 */
public class TemperatureDisplay implements TemperatureObserver {

    @Override
    public void update(float temperature) {
        System.out.println("Temperature Display: " + temperature + "°C");
    }
    
}

