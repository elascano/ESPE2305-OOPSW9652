package ec.edu.espe.icecalculatorsystem.model;

import com.techware.tax.SalesTax;
import java.text.DecimalFormat;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class PlasticBag {

    private float unitPrice;
    private float totalBagPrice;

    public PlasticBag(float unitPrice) {
        this.unitPrice = unitPrice;
        this.totalBagPrice = SalesTax.computeICEAssign(unitPrice, 0.06F, 12);
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String formattedUnitPrice = decimalFormat.format(unitPrice);
        String formattedTotalBagPrice = decimalFormat.format(totalBagPrice);

        return "Plastic Bag Price: \n-Unit Price=" + formattedUnitPrice + "\n-Total Bag Price=" + formattedTotalBagPrice;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getTotalBagPrice() {
        return totalBagPrice;
    }

    public void setTotalBagPrice(float totalBagPrice) {
        this.totalBagPrice = totalBagPrice;
    }

}
