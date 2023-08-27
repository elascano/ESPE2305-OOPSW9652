package ec.edu.espe.observerpattern.controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class NotificationSystem {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message, String client) {
        for (Observer observer : observers) {
            observer.update(message, client);
        }
    }

    public void sendNotification(String message, String client) {

        notifyObservers(message, client);
    }
}
