/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.operationgosling.tax.sales;

/**
 *
 * @author PabloEZurita
 */
public class SalesTax {
    public static float computeIVA(float total, float ivaPercentage){
        float totalAndIva;
        totalAndIva = total + total*ivaPercentage/100;
        return totalAndIva;
    }
    
    public static float computeIce(float total, float ivaPercentage){
        float totalAndIce=0.0F;
     
        return totalAndIce;
    }
    
    
}
