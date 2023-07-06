package ec.edu.espe.calc.view;

import ec.edu.espe.calc.controller.BasicOperation;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Calculator {
    public static void main(String[] args) {
        BasicOperation basicOperation;
        basicOperation = new BasicOperation();
        
        float addend1 = 1.2F;
        float addend2 = 3.4F;
        float sum;
        
        float minuend = 1.0F;
        float subtrahend = 0.0F;
        float difference;
        
        sum = basicOperation.add(addend1, addend2);
        difference = basicOperation.subtract(minuend, subtrahend);
        
        System.out.println("Edison Ludena");
        
        System.out.println("The sum of " + addend1 +" + "+ addend2 + " --> " + sum);
        System.out.println("The difference if " + minuend + " - " + subtrahend + " --> " + difference);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        
        
    }
    
}
