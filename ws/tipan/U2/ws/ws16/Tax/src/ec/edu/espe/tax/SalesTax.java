/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.tax;

/**
 *
 * @author Oswaldo Tipan
 */
public class SalesTax {
    
    public static float computeIva(float total, float ivaPercentage){
        float totalAndIva;
        totalAndIva = total + total * ivaPercentage/100;
        return totalAndIva;
    }
    
    public static float computerIce(float total, float icePercentage){
        float totalAndIce = 0.0F;
        return totalAndIce; 
    }
}
