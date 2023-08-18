/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.calculator.controller;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class Tax {
    
    private static Tax instance;
    private float tax = 0.12f;
    
    public static Tax getInstance() {
        if (instance == null) {
            instance = new Tax();
        }
        return instance;
    }
    
    public float calculateTax(float price) {
        float priceWithTax = price + (price * tax);
        return priceWithTax;
    }
   
}
