/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.compositeexample.controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class Zoo implements Animal{
    private String name;
    public List<Animal> animals = new ArrayList<>();

    public Zoo(String name) {
        this.name = name;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println("Zoo " + name + " sounds:");
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    @Override
    public String getSound() {
       return null;
    }
}
