/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.wscodetodiagram.model;

import java.util.Date;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public abstract class Animal extends Claw {
    private Date bornOnDate;
    private Claw[] claws = new Claw[20];
    
    public void getAge(){
        bornOnDate = new Date();
        System.out.println("The animal was born " + bornOnDate);
    }
    public abstract void feed();
    
    public static void born(){
        
    }
}
