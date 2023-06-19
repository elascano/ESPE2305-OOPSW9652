
package ec.edu.espe.icecalculatorsystem.model;

import com.techware.tax.SalesTax;
import java.text.DecimalFormat;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class AlcoholImport {
    float unitPrice;
    float totalPrice;

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedUnitPrice = decimalFormat.format(unitPrice);
        String formattedTotalPrice = decimalFormat.format(totalPrice);

        return "Alcohol Import: \n-Unit Price=" + formattedUnitPrice + "\n-Total Price=" + formattedTotalPrice;
    }

    public AlcoholImport(float unitPrice) {
        this.unitPrice = unitPrice;
        this.totalPrice = SalesTax.computeICEAssign(unitPrice, 7.15F, 12);
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
    
}
