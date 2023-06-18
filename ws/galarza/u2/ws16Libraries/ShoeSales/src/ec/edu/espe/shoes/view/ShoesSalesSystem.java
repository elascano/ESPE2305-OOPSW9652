/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.shoes.view;

import ec.edu.espe.shoes.model.PairOfShoes;
import ec.edu.espe.tax.SalesTax;

/**
 *
 * @author Cesar Galarza, BugBusters, DCCO-ESPE
 */
public class ShoesSalesSystem {
    public static void main(String[] args) {
        PairOfShoes pairOfShoes;
        float price;
        float ivaPercentage;
        ivaPercentage = 12.0F;
        price = 20.37F;
        float totalPrice;
        
        System.out.println("**César Galarza - The Shoe Maker **");
        totalPrice = SalesTax.computeIva(price,ivaPercentage);
        pairOfShoes = new PairOfShoes(1,"Venus", "Escolar", price, totalPrice);
        System.out.println("pair of shoes --> " + pairOfShoes);
        
        pairOfShoes = new PairOfShoes(1,"Venus", "Escolar", 20.0F, 22.40F);
        System.out.println("pair of shoes --> " + pairOfShoes);

        price = 10.0F;
        pairOfShoes = new PairOfShoes(1,"Buestan","Casual",price);
        System.out.println("pair of shoes --> " + pairOfShoes);
    }
}
