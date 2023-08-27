/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exampleobserverpattern.controller;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class Subscriber implements Observer {

    private Observable observable;
    private String lastVideo;
    public Subscriber(Observable observable){//referencia al observable
        this.observable = observable;
    }
    
    public void setLastVideo(String lastVideo){//metodo que actualiza al titulo del ultimo video
        this.lastVideo = lastVideo;
    }
    
    @Override
    public void update() {
        System.out.println("The Channel Uploaded New Video");
        System.out.println(lastVideo);
    }
    
}
