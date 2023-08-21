package ec.edu.espe.calculatetax.controller;

/**
 *
 * @author Paul Moreno
 */
public class UsTax {

    private static UsTax instance;
    private float tax;
   
    private UsTax() {
        tax = 12.0f;
    }
    

    public static UsTax getInstance() {
        if (instance == null) {
            instance = new UsTax();
        }
        return instance;
    }

    public float computeSalesTotal(float price) {
        return price * ((tax + 100) / 100);
    }

    public void updateTax(float newTax) {
        tax = newTax;

    }

}
