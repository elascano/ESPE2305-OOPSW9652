/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.observerpattern.model;

import java.util.ArrayList;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class Throttle implements Observable{

    private ArrayList<Observer> observer;//puede ser mas objetos
    
    public Throttle (){//inicializar el observador(observer)
        observer = new ArrayList<Observer>();
    }
    
    public void bindObserver(Observer o){
        observer.add(o);// metodo para enlazar observador(observer)
    }
    public void stepOnTheAccelerator(){//pisar el acelerador
        notificar();//va a subir la potencia del motor entonces notifica

    }
    
    @Override
    public void notificar() {
        for (Observer o:observer){//recorrer los observadores y notificar a cada uno
            o.update();
        }
    }

    
}
