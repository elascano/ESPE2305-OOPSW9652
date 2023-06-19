package com.techware.accounting.model;

import com.techware.tax.SalesTax;
import java.util.Scanner;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class ComputeTax {
    public void computeIva(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nProduct: ");
        String product = scanner.nextLine();
        System.out.print("Subtotal: ");
        float subtotal = scanner.nextFloat();
        System.out.print("IVA Percentage: ");
        float ivaPercentage = scanner.nextFloat();
        
        float total = SalesTax.computeIva(subtotal, ivaPercentage);
        System.out.println("\n" + product + " total: " + total);
    }
    
    public void computeIce(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nProduct: ");
        String product = scanner.nextLine();
        System.out.print("Subtotal: ");
        float subtotal = scanner.nextFloat();
        System.out.print("ICE Percentage: ");
        float icePercentage = scanner.nextFloat();
        
        float total = SalesTax.computeIce(subtotal, icePercentage);
        System.out.println("\n" + product + " total: " + total);
    }
}
