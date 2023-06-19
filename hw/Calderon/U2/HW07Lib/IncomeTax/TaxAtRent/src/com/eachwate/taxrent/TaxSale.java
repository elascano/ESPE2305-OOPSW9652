
package com.eachwate.taxrent;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class TaxSale {
    
    public static float computeIva(float total,float ivaPercentage){
        
        float totalAndIva;
        totalAndIva = total +total*ivaPercentage/100;
        return totalAndIva;
    }
    
    public static float computeICEPercentage(float total, float icePercentage,float ivaPercentage){
        float totalAndIce ;
        totalAndIce = total +(total*icePercentage/100)+(total*ivaPercentage/100);
        return totalAndIce;
        
    }
    public static float computeICEAssign(float unitCost, float rate, float ivaPercentage){
        float unitAndIce;
        unitAndIce= unitCost+(unitCost*ivaPercentage/100)+rate;
        return unitAndIce;
    }
    
}
