package ec.edu.espe.ivacalculator.controller;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class USTax {

    private static USTax instance;
    private float iva;

    private USTax() {
        iva = 0.08F;
    }

    public static USTax getInstance() {
        if (instance == null) {
            instance = new USTax();
        }
        return instance;
    }

    public void setIva(float newIva) {
        iva = newIva/100;
    }

    public float salesTotal(float price) {
        float salesIva = price * iva;
        float salesTotal = price + salesIva;
        return salesTotal;
    }

}
