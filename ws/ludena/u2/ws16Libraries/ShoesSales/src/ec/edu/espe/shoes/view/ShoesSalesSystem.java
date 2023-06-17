
package ec.edu.espe.shoes.view;

import com.bugbusters.tax.SalesTax;
import ec.edu.espe.shoes.model.PairOfShoes;

/**
 *
 * @author LENOVO
 */
public class ShoesSalesSystem {
    public static void main(String[] args) {
        PairOfShoes pairOfShoes;
        float price;
        float ivaPercentage;
        ivaPercentage = 12.0F;
        price = 20.0F;
        float totalPrice;
        
        System.out.println("Edison Ludena show maker");
        totalPrice = SalesTax.computeIva(price, ivaPercentage);
        pairOfShoes = new PairOfShoes(1,"Venus","escolar",price,totalPrice );
        System.out.println("Pair of shoes --> " + pairOfShoes);
        
        pairOfShoes = new PairOfShoes(1,"Venus","Escolar",20.0F,22.40F);
        System.out.println("Pair of Shoes --> " + pairOfShoes);
        
        price = 10.0F;
        
        pairOfShoes = new PairOfShoes(1,"Brand","Casual",price);
        System.out.println("Psir of shoes --> " + pairOfShoes);
        
    }
}

