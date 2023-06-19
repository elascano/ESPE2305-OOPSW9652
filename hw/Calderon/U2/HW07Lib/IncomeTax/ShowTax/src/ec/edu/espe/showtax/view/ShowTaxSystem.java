
package ec.edu.espe.showtax.view;

import com.eachwate.taxrent.CalculateRentTax;
import ec.edu.espe.showtax.model.ShowIncomeTax;
import java.util.Scanner;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class ShowTaxSystem {
    
    public static void main(String[] args){
    
        ShowIncomeTax showIncomeTax;
        
        float monthSalary;
        float totalSalary;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\t\t\t\t ---Income Tax System---");
        System.out.println("\t\t\t -----System by Calderon Jilmar----");
        
        System.out.println("\n Enter your salary month: ");
        monthSalary = scanner.nextFloat();
        
        totalSalary = CalculateRentTax.computeIncomeTax(monthSalary);
        
        System.out.println("\n\tAnnual Tax: " + totalSalary);
    }
    
}
