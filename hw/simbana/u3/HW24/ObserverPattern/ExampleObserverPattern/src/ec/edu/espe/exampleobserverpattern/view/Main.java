/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.exampleobserverpattern.view;

import ec.edu.espe.exampleobserverpattern.controller.Subscriber;
import ec.edu.espe.exampleobserverpattern.controller.YoutubeChannel;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class Main {
    public static void main(String[] args) {
        YoutubeChannel xQc = new YoutubeChannel();
        Subscriber steven = new Subscriber(xQc);
        xQc.bindObserver(steven);
        steven.setLastVideo("Gaspi Add New Video Now");
        steven.update();
        
    }
    
}
