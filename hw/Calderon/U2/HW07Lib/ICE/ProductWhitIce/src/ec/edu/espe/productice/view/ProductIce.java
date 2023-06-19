
package ec.edu.espe.productice.view;

import com.eachwate.taxrent.TaxSale;
import ec.edu.espe.productice.model.BeverageAlcoholic;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class ProductIce {
    public static void main(String[] args){
        
    BeverageAlcoholic beverageAlcoholic;
    
        float unitPrice = 0;
        float gradeAlcohol;
        float totalPrice = 0;
    
        System.out.println("\nCalderon Jilmar Beverages\n");
        
        totalPrice = TaxSale.computeICEAssign(unitPrice, unitPrice, totalPrice);
        
        beverageAlcoholic = new BeverageAlcoholic("Pilsener", 1.5F, 30, totalPrice);
        System.out.println( beverageAlcoholic);
        
        beverageAlcoholic = new BeverageAlcoholic("Club", 2, 25, totalPrice);
        System.out.println(beverageAlcoholic);
        
        
        beverageAlcoholic = new BeverageAlcoholic("Corona", 4.5F, 40, totalPrice);
        System.out.println(beverageAlcoholic);
    
    }
}
