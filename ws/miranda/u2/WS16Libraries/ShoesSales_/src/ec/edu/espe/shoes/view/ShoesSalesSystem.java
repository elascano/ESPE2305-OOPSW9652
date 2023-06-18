package ec.edu.espe.shoes.view;

import com.bugbusters.tax.SalesTax;
import ec.edu.espe.shoes.model.PairOfShoes;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class ShoesSalesSystem {
    public static void main(String[] args) {
        PairOfShoes pairOfShoes;
        float price;
        float ivaPercentage;
        ivaPercentage = 12.0F;
        price = 20.37F;
        float totalPrice;
        
        System.out.println("Alison Miranda shoe maker");
        totalPrice = SalesTax.computeIva(price, ivaPercentage);
        
        pairOfShoes = new PairOfShoes(1, "Venus", "escolar", price, totalPrice);
        System.out.println("pair of shoes ---> " + pairOfShoes);
        
        
        pairOfShoes = new PairOfShoes(2, "Buestan", "escolar", 20.0F, 0);
        System.out.println("pair of shoes ---> " + pairOfShoes);
    
        price=10.0F;
        pairOfShoes = new PairOfShoes(3,"Venus","casual",price,totalPrice);
        System.out.println("pair of shoes ---> "+ pairOfShoes);
    }
 
}
