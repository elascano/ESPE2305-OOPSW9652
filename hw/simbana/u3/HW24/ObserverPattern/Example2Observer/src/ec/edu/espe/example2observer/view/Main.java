/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.example2observer.view;

import ec.edu.espe.example2observer.controller.Canvas;
import ec.edu.espe.example2observer.controller.DrawingApp;
import ec.edu.espe.example2observer.controller.ShapeList;
import ec.edu.espe.example2observer.model.Circle;
import ec.edu.espe.example2observer.model.Square;
import ec.edu.espe.example2observer.model.Triangle;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class Main {
    public static void main(String[] args) {
        DrawingApp app = new DrawingApp();

        Canvas canvas = new Canvas();
        ShapeList shapeList = new ShapeList();

        app.addObserver(canvas);
        app.addObserver(shapeList);

        app.addShape(new Circle());
        app.addShape(new Square());
        app.addShape(new Triangle());
    }
}
