
package ec.edu.espe.productice.model;

import com.eachwate.taxrent.TaxSale;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class BeverageAlcoholic {
        
        private String brand;
        private float unitPrice;
        private float gradeAlcohol;
        private float totalPrice;

    public BeverageAlcoholic(String brand, float unitPrice, float gradeAlcohol, float totalPrice) {
        this.brand = brand;
        this.unitPrice = unitPrice;
        this.gradeAlcohol = gradeAlcohol;
        this.totalPrice = totalPrice = TaxSale.computeICEAssign(unitPrice, unitPrice, totalPrice);
    }

    @Override
    public String toString() {
        return "\tBeverage Alcoholic:" + "\nbrand: " + brand + 
                "\nunit Price: " + unitPrice + "\ngradeAlcohol: " + gradeAlcohol + 
                "\ntotalPrice: " + totalPrice;
    }
        

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public float getGradeAlcohol() {
        return gradeAlcohol;
    }

    public void setGradeAlcohol(float gradeAlcohol) {
        this.gradeAlcohol = gradeAlcohol;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

}
