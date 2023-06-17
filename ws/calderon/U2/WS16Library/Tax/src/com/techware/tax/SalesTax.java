
package com.techware.tax;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class SalesTax {
    
    public static float compute(float total, float ivaPercentage){
    
        float totalAndIva;
        totalAndIva = total + total * ivaPercentage/100;
        return totalAndIva;
    }
    
    public static float computeIce(float total, float icePercentage){
    
        float totalAndIce = 0.0F;
        return totalAndIce;
    }
}
