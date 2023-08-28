/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.observer.model;

/**
 *
 * @author LENOVO
 */
public class Fan implements TemperatureObserver{
    @Override
    public void update(float temperature) {
        if (temperature > 25) {
            System.out.println("Fan: Turning on the fan.");
        } else {
            System.out.println("Fan: Turning off the fan.");
        }
    }
}
