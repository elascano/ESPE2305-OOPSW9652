/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exampleobserverpattern.controller;

import java.util.ArrayList;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class YoutubeChannel implements Observable {

    private ArrayList<Observer> channelSubscriber;

    public YoutubeChannel() {
        channelSubscriber = new ArrayList<Observer>();
    }

    public void bindObserver(Observer c) {
        channelSubscriber.add(c);// metodo para enlazar observador(observer)
    }
    public void addNewVideo(String tittle){
        this.notifycate();//añade un nuevo vide, debemos llamar al notifycate
        //para notificar el cambio a los subscriptores
        System.out.println("New youtube video is out");
    }

    @Override
    public void notifycate() {
        for (Observer c : channelSubscriber) {
            c.update();
        }
    }

}
