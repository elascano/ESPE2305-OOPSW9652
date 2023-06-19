
package ec.edu.espe.tax;

import java.math.BigDecimal;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class IncomeTax {
    public static double compute(double annualSalary) {
        double annualTax = 0.0;
        
        if (annualSalary <= 11722.0) {
            annualTax = 0.0;
        } else if (annualSalary <= 14935.0) {
            annualTax = (annualSalary - 11722.0) * 0.05;
        } else if (annualSalary <= 18666.0) {
            annualTax = (annualSalary - 14935.0) * 0.10 + 161.0;
        } else if (annualSalary <= 22418.0) {
            annualTax = (annualSalary - 18666.0) * 0.12 + 534.0;
        } else if (annualSalary <= 32783.0) {
            annualTax = (annualSalary - 22418.0) * 0.15 + 984.0;
        } else if (annualSalary <= 43147.0) {
            annualTax = (annualSalary - 32783.0) * 0.20 + 2539.0;
        } else if (annualSalary <= 53512.0) {
            annualTax = (annualSalary - 43147.0) * 0.25 + 4612.0;
        } else if (annualSalary <= 63876.0) {
            annualTax = (annualSalary - 53512.0) * 0.30 + 7203.0;
        } else if (annualSalary <= 103644.0) {
            annualTax = (annualSalary - 63876.0) * 0.35 + 10312.0;
        }else if (annualSalary > 103644.0){
            annualTax = (annualSalary - 103644.0)*0.37+24231.0;
        }
        
        return annualTax;
    }
}

