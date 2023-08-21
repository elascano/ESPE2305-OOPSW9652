/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractfactory.controller;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class WebService  implements InformaticService{ //producto concreto

    @Override
    public String SetWork() {
         return " The Programers are ready";
    }

    @Override
    public String SetDate() {
         return " The website is for  18/08/2023";
    }

    @Override
    public String SetPayment() {
         return " Type of payment :credit";
    }

    
    
}
