
package ec.edu.espe.shoes.view;

import ec.edu.espe.shoes.model.PairOfShoes;
import ec.edu.espe.tax.SalesTax;

/**
 *
 * @author Juan Rueda, The Encoders, DCCO-ESPE
 */
public class ShoesSalesSystem {
    
    public static void main(String[] args) {
        PairOfShoes pairOfShoes;
        float price;
        float ivaPrecentage;
        ivaPrecentage = 12.0F;
        price = 20.37F;
        float totalPrice;
        
        System.out.println("Juan Rueda shoe maker");
        totalPrice = SalesTax.computeIva(price, ivaPrecentage);
        pairOfShoes = new PairOfShoes(1, "Venus", "Escolar", price , totalPrice) ;
        System.out.println("pair of shoes ----> " + pairOfShoes);
        
        pairOfShoes = new PairOfShoes(1, "Venus", "Escolar", 20.0F , 22.40F) ;
        System.out.println("pair of shoes ----> " + pairOfShoes);
        
        price = 10.0F;
        pairOfShoes = new PairOfShoes(1, "Buestan", "Casual", 20.0F , 0) ;
        System.out.println("pair of shoes ----> " + pairOfShoes);
        
    }
}
