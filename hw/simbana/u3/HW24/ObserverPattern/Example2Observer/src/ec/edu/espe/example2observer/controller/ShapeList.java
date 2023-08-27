/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.example2observer.controller;

import ec.edu.espe.example2observer.model.Shape;
import java.util.List;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class ShapeList implements Observer{

    @Override
    public void update(List<Shape> shapes) {
        System.out.println("Updating shape list: ");
        for(Shape shape : shapes){
            System.out.println(shape.getClass().getSimpleName());
        }
    }
    
}
