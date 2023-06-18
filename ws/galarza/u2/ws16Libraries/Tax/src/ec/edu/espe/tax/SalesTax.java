/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.tax;

/**
 *
 * @author Cesar Galarza, BugBusters, DCCO-ESPE
 */
public class SalesTax {
    public static float computeIva(float total, float ivaPercentage){
        
        
        float totalAndIva;
        totalAndIva = total + total * ivaPercentage/100;
        return totalAndIva;
        
    }
    
    public static float computeIce(float total, float ivaPercentage){
        
        float totalAndIce=0.0F;
        return totalAndIce;
        
    }
}
