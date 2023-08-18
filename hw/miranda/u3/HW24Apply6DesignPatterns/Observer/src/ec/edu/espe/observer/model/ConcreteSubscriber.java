/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.observer.model;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class ConcreteSubscriber implements Subscriber{

    private String name;

    public ConcreteSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received a message: " + message);
    }
}
