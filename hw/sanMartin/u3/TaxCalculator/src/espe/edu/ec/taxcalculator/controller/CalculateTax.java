
package espe.edu.ec.taxcalculator.controller;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class CalculateTax {
    private static CalculateTax instance;
    
    
    private CalculateTax(){
        
    }
    public static CalculateTax getInstance(){
        if(instance == null)
            instance = new CalculateTax();
        return instance;
    }
    
    public double calculateTax(double price) {
        return price * 1.12;
    }
}
