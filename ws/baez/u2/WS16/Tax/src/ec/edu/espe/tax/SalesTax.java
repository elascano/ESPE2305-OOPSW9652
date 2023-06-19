package ec.edu.espe.tax;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class SalesTax {
    public static float computeIva(float total, float ivaPercentage){
        float totalAndIva;
        totalAndIva = total + total * ivaPercentage/100;
        return totalAndIva;
    }
    
    public static float computeIce(float total, float ivaPercentage){
        float totalAndIce=0.0F;
        return totalAndIce;
    }
}
