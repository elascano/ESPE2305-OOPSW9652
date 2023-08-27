
package ec.edu.espe.calculatortax.controller;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class USTax {

    private static USTax instance;
   
    private float tax;

    private USTax() {
        tax = 0.12F;
    }

    public static USTax getInstance() {

        if (instance == null) {
            instance = new USTax();
        }

        return instance;
    }

    public float TotalTax(float priceTotal) {

        return priceTotal * tax;
    }

    public float TotalPrice(float priceTotal) {

        return priceTotal + (priceTotal * tax);
    }

    
    
    
}
