
package com.operartiongosling.taxes;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class IncomeTax {
     public static float compute(float salary,float surpuluFractionTax,float minimunSalary, float maximunSalary){
        float totalAnualSalary;
        float subtotal;
        float surpuluFractionTaxTotal;
        float incomeTax;
        totalAnualSalary = salary*12;
        subtotal=maximunSalary-totalAnualSalary;
        surpuluFractionTaxTotal=subtotal*(surpuluFractionTax/100.0F);
        incomeTax=subtotal+surpuluFractionTaxTotal;
        return incomeTax;
    }
}
