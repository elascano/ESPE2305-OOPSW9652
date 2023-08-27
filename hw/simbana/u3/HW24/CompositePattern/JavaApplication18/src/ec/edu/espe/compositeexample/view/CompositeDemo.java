/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.compositeexample.view;

import ec.edu.espe.compositeexample.controller.Animal;
import ec.edu.espe.compositeexample.controller.Zoo;
import ec.edu.espe.compositeexample.controller.ZooView;
import ec.edu.espe.compositeexample.model.Elephant;
import ec.edu.espe.compositeexample.model.Lion;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class CompositeDemo {
    public static void main(String[] args) {
        Animal zoo = new Zoo("ZooGuallabamba");
        Animal lion = new Lion("Spike");
        Animal elephant = new Elephant("Dumbo");

        ((Zoo) zoo).addAnimal(lion);
        ((Zoo) zoo).addAnimal(elephant);

        zoo.makeSound();

        ZooView view = new ZooView();
        view.display(zoo);
    }
}
