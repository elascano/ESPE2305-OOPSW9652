
package ec.edu.espe.observer.view;

import ec.edu.espe.observer.model.Fan;
import ec.edu.espe.observer.model.TemperatureDisplay;
import ec.edu.espe.observer.model.TemperatureObserver;
import ec.edu.espe.observer.model.TemperatureSensor;

/**
 *
 * @author LENOVO
 */
public class Observer {

    public static void main(String[] args) {
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        TemperatureObserver temperatureDisplay = new TemperatureDisplay();
        TemperatureObserver fan = new Fan();

        temperatureSensor.registerObserver(temperatureDisplay);
        temperatureSensor.registerObserver(fan);

        temperatureSensor.setTemperature(20);
        temperatureSensor.setTemperature(30);
    }
}
