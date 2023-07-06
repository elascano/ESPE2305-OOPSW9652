
package ec.edu.espe.calculator.view;

import ec.edu.espe.calculator.controller.BasicOperation;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class Calculator {
    public static void main(String[] args){
    
        BasicOperation basicOperation;
        basicOperation = new BasicOperation();
        
        float addend1 = 1.2F;
        float addend2 = 3.4F;
        
        float sum;
        
        float minuend = 1.0F;
        float subtrahend = 0.0F;
        float difference;
        
        
        sum = basicOperation.add(addend1, addend2);
        difference = basicOperation.substract(minuend, subtrahend);
        
        
        System.out.println("Calderon Jilmar Calculator");
        System.out.println("The sum of " + addend1 + " + " + addend2 + "--> " + sum);
        System.out.println("The difference of " + minuend + " - " + subtrahend + "-->" + difference);
    }
}
