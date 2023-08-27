/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.wscodetodiagram.model;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class Pidgeon extends Bird {
    private String foodType;
    
    @Override
    public void feed(){
        System.out.println("The Pidgeon eat " + foodType);
    }
}
