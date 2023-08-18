/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.observer.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class Publisher {

    private List<Subscriber> subscribers = new ArrayList<>();
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifySubscribers();
    }

    public void attach(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void detach(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }
}
