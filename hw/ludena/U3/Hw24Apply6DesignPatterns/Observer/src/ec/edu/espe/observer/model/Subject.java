/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.espe.observer.model;

/**
 *
 * @author LENOVO
 */
public interface Subject {
    public void registerObserver(TemperatureObserver temperatureObserver);
    public void removeObserver(TemperatureObserver temperatureObserver);
    public void notifyObservers();
}
