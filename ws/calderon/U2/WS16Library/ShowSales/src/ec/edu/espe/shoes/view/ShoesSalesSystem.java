
package ec.edu.espe.shoes.view;

import com.techware.tax.SalesTax;
import ec.edu.espe.shoes.model.PairOfShoes;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class ShoesSalesSystem {
    
    public static void main(String[] args){
    
        PairOfShoes pairOfShoes;
        float price;
        float ivaPercentage;
        ivaPercentage = 12.0F;
        price = 20.37F;
        float totalPrice;
        
        System.out.println("\nCalderon Jilmar Shoe Maker\n");
        
        totalPrice = SalesTax.computeIva(price, ivaPercentage);
        
        pairOfShoes = new PairOfShoes(1, "Venus", "Escolar", price, totalPrice);
        System.out.println("Pair of Shoes--> "+pairOfShoes);
        
        pairOfShoes = new PairOfShoes(1, "Venus", "Escolar", 20.0F, 22.40F);
        System.out.println("Pair of Shoes--> "+pairOfShoes);
        
        price= 10.0F;
        pairOfShoes = new PairOfShoes(1, "Brand", "Casual", price,0);
        System.out.println("Pair of Shoes--> "+pairOfShoes);
    }
}
