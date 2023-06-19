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
    
    public static float computeIce(int total){
        float totalAndIce=total*6;
     
        return totalAndIce;
    }
    
    public static float computeIncomeTax(float valuePerMonth){
       float totalPayment = 0;
       float valuePerYear = valuePerMonth*12;
        if (valuePerYear>=0  && valuePerYear<11.722){
            totalPayment = (float) (valuePerYear - (valuePerYear * 0))/12;
        }
        if (valuePerYear>=11.722  && valuePerYear<14.935){
            totalPayment = (float) (valuePerYear - (valuePerYear * 0))/12;
        }
        if (valuePerYear>=14.935  && valuePerYear<18.666){
            totalPayment = (float) (valuePerYear - (valuePerYear * 0.10))/12;
        }
        if (valuePerYear>=18.666  && valuePerYear<22.418){
            totalPayment = (float) (valuePerYear - (valuePerYear * 0.12))/12;
        }
        if (valuePerYear>=22.418  && valuePerYear<32.783){
            totalPayment = (float) (valuePerYear - (valuePerYear * 0.15))/12;
        }
        if (valuePerYear>=32.783 && valuePerYear<43.147){
            totalPayment = (float) (valuePerYear - (valuePerYear * 0.20))/12;
        }
        if (valuePerYear>=43.147  && valuePerYear<53.512){
            totalPayment = (float) (valuePerYear - (valuePerYear * 0.25))/12;
        }
        if (valuePerYear>=53.512  && valuePerYear<63.876){
            totalPayment = (float) (valuePerYear - (valuePerYear * 0.30))/12;
        }
        if (valuePerYear>=63.876 && valuePerYear<103.644){
            totalPayment = (float) (valuePerYear - (valuePerYear * 0.35))/12;
        }
        if (valuePerYear>=103.644){
            totalPayment = (float) (valuePerYear - (valuePerYear * 0.37))/12;
        }    
        return totalPayment;
    }
    
}
