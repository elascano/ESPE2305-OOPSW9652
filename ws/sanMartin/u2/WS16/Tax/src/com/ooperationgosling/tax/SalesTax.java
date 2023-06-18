/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ooperationgosling.tax;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class SalesTax {
    public static float compute(float total,float ivaPercentage){
        float totalAndIva;
        totalAndIva = total + (total*ivaPercentage/100);
        return totalAndIva;
    }
    public static float computeIce(float total, float icePerecentage){
        float totalAndIce=0.0F;
        return totalAndIce;
    }
}
