/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.calc.view;

import ec.edu.espe.calc.controller.BasicOperation;

/**
 *
 * @author Labs-DCCO
 */
public class Calculator {
    public static void main(String[] args) {
        BasicOperation basicOperation;
        basicOperation = new BasicOperation();
        
        float adden1 = 1.2F;
        float adden2 = 3.4F;
        float sum;
        
        float minuend = 0.0F;
        float subtrahend = 1.0F;
        float difference;
        
        
        
        
        sum = basicOperation.add(adden1, adden2);
        difference = basicOperation.subtrtact(minuend, subtrahend);
        
        System.out.println("The sum of " + adden1 + "+" +adden2 + "-->" + sum);
        System.out.println("The diefference of "+ minuend +" - "+ subtrahend + "---->"+ difference);
        System.out.println("Michael Simbana");
    }
    
}
