package ec.edu.espe.tax;

/**
 *
 * @author Juan Rueda, The Encoders, DCCO-ESPE
 */
public class SalesTax {
    public static float computeIva(float total, float ivaPercentage){
        
        float totalAndIva;
        totalAndIva = total + total * ivaPercentage/100;
        return totalAndIva;
    }
    public static float computeIce(float total, float icePercetage){
        float totalAndIce = 0.0F;
        return totalAndIce;
    }
}
