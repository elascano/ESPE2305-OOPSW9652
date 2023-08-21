/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.abstractfactory.controller;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class SoftwareService implements InformaticService{ //producto concreto

    @Override
    public String SetWork() {
         return " The Software engineers are ready";
    }

    @Override
    public String SetDate() {
         return " The proyect is for  20/08/2023";
    }

    @Override
    public String SetPayment() {
         return " Type of payment :Transaction";
    }
  
}
