package ec.edu.espe.shoesales.view;

import com.techware.tax.SalesTax;
import ec.edu.espe.shoesales.model.PairOfShoes;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class ShoesSaleSystem {

    public static void main(String[] args) {
        PairOfShoes pairOfShoes;
        float price;
        price = 20.37F;
        float ivaPercentage;
        ivaPercentage = 12.0F;
        float totalPrice;
        
        totalPrice = SalesTax.computeIva(price, ivaPercentage);

        System.out.println("Gabriel Calvache Shoe Maker");
        pairOfShoes = new PairOfShoes(1, "Venus", "Escolar", price, totalPrice);
        System.out.println("Pair of Shoes--> "+pairOfShoes);
        
        pairOfShoes = new PairOfShoes(1, "Venus", "Escolar", 20.0F, 22.40F);
        System.out.println("Pair of Shoes--> "+pairOfShoes);
        
        price= 10.0F;
        pairOfShoes = new PairOfShoes(1, "Brand", "Casual", price);
        System.out.println("Pair of Shoes--> "+pairOfShoes);        
    }
}
