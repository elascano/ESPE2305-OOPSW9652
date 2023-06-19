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
    
    public static float computeIce(float icePercentage, float pricePerUnit, int numberOfPackages, int boxesPerPackage, int unitsPerBox){
        int totalOfProducts;
        float taxes;
        float total;
        float totalAndIce;
        
        totalOfProducts = (unitsPerBox * boxesPerPackage)* numberOfPackages;
        taxes = totalOfProducts * (icePercentage/100);
        total = pricePerUnit * totalOfProducts;
        totalAndIce = total + taxes;
        
        return (taxes);
    }
}
