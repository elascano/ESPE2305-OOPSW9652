/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erationgosling.shoesales.controller;

import com.erationgosling.shoesales.model.PairOfShoes;
import com.operationgosling.tax.sales.SalesTax;

/**
 *
 * @author PabloEZurita
 */
public class ShoesSalesSystem {
    public static void main() {
        PairOfShoes pairOfShoes;
        PairOfShoes pairOfShoes2;
        PairOfShoes pairOfShoes3;
        float price;
        float ivaPercentage;
        ivaPercentage = 12.0F;
        price = 20.37F;
        float totalPrice;
        System.out.println("----- Pablo Zurita shoes maker -----");
        totalPrice = SalesTax.computeIVA(price, ivaPercentage);
        pairOfShoes = new PairOfShoes(1, "Venus", "Escolar", price, totalPrice);
        System.out.println("Pair Of Shoes -> "+ pairOfShoes);
        
        price = 10.37F;
        float totalPrice2 = SalesTax.computeIVA(price, ivaPercentage);
        pairOfShoes2 = new PairOfShoes(2, "Venus", "Escolar", price, totalPrice2);
        System.out.println("Pair Of Shoes -> "+pairOfShoes2);
        
        price = 12.37F;
        float totalPrice3 = SalesTax.computeIVA(price, ivaPercentage);
        pairOfShoes3 = new PairOfShoes(3, "Venus", "Escolar", price, totalPrice3);
        System.out.println("Pair Of Shoes -> "+pairOfShoes3);
        
        int totalShoes = pairOfShoes3.id;
        
        float profitPerMonth = totalPrice + totalPrice2 + totalPrice3;
        System.out.println("Gross Profit ->  " + profitPerMonth);
        float totalProfit = SalesTax.computeIncomeTax(profitPerMonth) - SalesTax.computeIce(totalShoes);
        System.out.println("Total Profit -> " + totalProfit);
        
        }
}