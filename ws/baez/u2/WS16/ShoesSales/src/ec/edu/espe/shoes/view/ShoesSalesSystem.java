package ec.edu.espe.shoes.view;

import ec.edu.espe.shoes.model.PairOfShoes;
import ec.edu.espe.tax.SalesTax;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class ShoesSalesSystem {
    public static void main(String[] args) {
        PairOfShoes pairOfShoes;
        float price;
        float ivaPercentage;
        ivaPercentage = 12.0F;
        price = 20.0F;
        float totalPrice;
        totalPrice = SalesTax.computeIva(price, ivaPercentage);
        System.out.println("Gabriel Baez Shoe Maker");
        
        
        pairOfShoes = new PairOfShoes(1, "Venus", "escolar", price, totalPrice);
        System.out.println("pair of shoes --->" + pairOfShoes);
        
        pairOfShoes = new PairOfShoes(1, "Venus", "Escolar", 20.0F, 0);
        System.out.println("pair of shoes --->" + pairOfShoes);
        
        price = 10.0F;
        pairOfShoes = new PairOfShoes(1, "Buestan", "Casual", 10.0F);
        System.out.println("pair of shoes --->" + pairOfShoes);
    }
}
