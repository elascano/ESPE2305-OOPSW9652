/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.observer.view;

import ec.edu.espe.observer.model.ConcreteSubscriber;
import ec.edu.espe.observer.model.Publisher;
import ec.edu.espe.observer.model.Subscriber;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class Main {

    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        Subscriber subscriber1 = new ConcreteSubscriber("Subscriber 1");
        Subscriber subscriber2 = new ConcreteSubscriber("Subscriber 2");

        publisher.attach(subscriber1);
        publisher.attach(subscriber2);

        publisher.detach(subscriber1);

        publisher.setMessage("Observer 1 is no longer listening.");

        publisher.setMessage("Final message.");
    }
}
