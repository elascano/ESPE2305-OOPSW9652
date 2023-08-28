package ec.edu.espe.calculator1.controller;

/**
 *
 * @author Edison Ludeña
 */
public class Tax {

    private static Tax instance;
    private float tax = 0;

    private Tax() {
        tax = 12.0f;
    }
  
    public static Tax getInstance() {
        if (instance == null) {
            instance = new Tax();
        }
        return instance;
    }

    public float computeSalesTotal(float quantity) {
        return quantity * ((tax + 100) / 100);
    }
        
    public void updateTax(float newTax){
        tax = newTax;
    }

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }
    
    
}
