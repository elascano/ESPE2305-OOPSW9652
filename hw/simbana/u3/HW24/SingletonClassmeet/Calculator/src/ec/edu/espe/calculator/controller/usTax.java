/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.calculator.controller;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class usTax {
    private static usTax instance;
    private usTax(){
        
    }
    
    public static usTax getInstance(){
        if(instance == null){
            instance = new usTax();
        }
        return instance;
    }
    
    public float salesTotal(float price) {
        float taxRate = 0.0114f;
        float salesTax = price * taxRate;
        return price + salesTax;
    }
}
