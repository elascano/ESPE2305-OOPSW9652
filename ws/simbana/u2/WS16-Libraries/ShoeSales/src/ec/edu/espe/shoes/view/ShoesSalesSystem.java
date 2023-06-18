/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.shoes.view;

import com.opertaiongosling.tax.SalesTax;
import ec.edu.espe.shoes.model.PairOfShoes;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class ShoesSalesSystem {
    public static void main(String[] args) {
        PairOfShoes pairOfShoes;
        float price;
        float ivaPrecentage;
        ivaPrecentage = 12.0F;
        price = 20.37F;
        float totalPrice;
        System.out.println("Michael Simbana shoe make");
        totalPrice = SalesTax.computeIva(price, ivaPrecentage);
        pairOfShoes = new PairOfShoes(1, "Venus", "Escolar", price, totalPrice);
        System.out.println("pair of shoes ----> " + pairOfShoes);
        
        pairOfShoes = new PairOfShoes(1, "Venus", "Escolar", 20.0F, totalPrice);
        System.out.println("pair of shoes ---> " + pairOfShoes);
        
        price = 10.0F;
        pairOfShoes = new PairOfShoes(1, "Buestan", "casual", price, 0);
        System.out.println("pair of shoes ---->" + pairOfShoes);
    }
    
}
