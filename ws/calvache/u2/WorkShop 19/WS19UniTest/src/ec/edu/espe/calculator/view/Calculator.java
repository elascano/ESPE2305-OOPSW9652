/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.calculator.view;

import ec.edu.espe.calculator.controller.BasicOperation;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class Calculator {
    
    public static void main(String[] args) {
        BasicOperation basicOperation;
        basicOperation= new BasicOperation();
        
        float addend1= 1.2F;
        float addend2= 3.4F;
        float sum;
        
        float minuend= 0.0F;
        float subtrahend= 1.0F;
        float difference;
        
        sum= basicOperation.add(addend1, addend2);
        difference=basicOperation.subtract(minuend, subtrahend);
        
        System.out.println("Gabriel Calvache");
        
        System.out.println("The sum of "+ addend1 + "+" + addend2 + "--> "+ sum);
        System.out.println("The difference of "+ minuend + "-" + subtrahend + "--> "+ difference);
    }
}
