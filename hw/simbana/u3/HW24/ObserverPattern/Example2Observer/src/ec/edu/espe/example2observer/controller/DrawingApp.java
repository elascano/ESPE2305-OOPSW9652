/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.example2observer.controller;

import ec.edu.espe.example2observer.model.Shape;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class DrawingApp implements Observable{

    private List<Observer> observers = new ArrayList<>();
    private List<Shape> shapes = new ArrayList<>();
    
    public void addShape(Shape shape){
        shapes.add(shape);
        notifyObservers();
    }
    
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update(shapes);
        }
    }
    
}
