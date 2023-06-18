
package ec.edu.espe.tax;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class SalesTax {
    public static float computeIva(float total,float ivaPercentage){
        
        float totalAndIva;
        totalAndIva = total +total*ivaPercentage/100;
        return totalAndIva;
    }
    
    public static float computeICE(float total, float icePercentage){
        float totoalAndIce = 0.0F;
        return totoalAndIce;
        
    }
}
