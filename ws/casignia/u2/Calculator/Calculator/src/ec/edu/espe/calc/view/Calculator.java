package ec.edu.espe.calc.view;

import ec.edu.espe.calc.controller.BasicOperation;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class Calculator {
    public static void main(String[] args) {
        BasicOperation basicOperation;
        basicOperation = new BasicOperation();
        
        float addend1 = 1.2F;
        float addend2 = 3.4F;
        float sum;
        
        float minuend = 0.0F;
        float subtrahend = 1.0F;
        float difference;
        
        sum = basicOperation.add(addend1, addend2);
        difference = basicOperation.subtract(minuend, subtrahend);
        
        System.out.println("The sum of " + addend1 + " + " + addend2 + " = "+ sum);
        System.out.println("The sum of " + minuend + " - " + subtrahend + " = "+ difference);
    }
}
