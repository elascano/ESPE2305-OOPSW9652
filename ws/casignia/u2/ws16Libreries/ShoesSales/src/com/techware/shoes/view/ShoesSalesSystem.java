package com.techware.shoes.view;

import com.techware.shoes.model.PairOfShoes;
import com.techware.tax.SalesTax;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class ShoesSalesSystem {
    public static void main(String[] args){
        PairOfShoes pairOfShoes1;
        PairOfShoes pairOfShoes2;
        float price = 20.37F;
        float totalPrice;
        float ivaPrecentage = 12.0F;
        totalPrice = SalesTax.computeIva(price, ivaPrecentage);
        pairOfShoes1 = new PairOfShoes(1, "Venus", "Escolar", price, totalPrice);
        pairOfShoes2 = new PairOfShoes(2, "Buestan", "Casual", 20.0F);
        System.out.println("Pair of Shoes: " + pairOfShoes1);
        System.out.println("Pair of Shoes: " + pairOfShoes2);
    }
}
