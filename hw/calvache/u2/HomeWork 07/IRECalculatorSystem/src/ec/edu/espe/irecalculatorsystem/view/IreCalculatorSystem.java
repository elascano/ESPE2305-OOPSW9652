package ec.edu.espe.irecalculatorsystem.view;

import com.techware.tax.IreCalculation;
import java.util.Scanner;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class IreCalculatorSystem {

    public static void main(String[] args) {

        float salary;
        float totalTax;
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----Welcome to IRE Calculator System-----");
        System.out.println("-----By Gabriel Calvache-----");
        System.out.println("\nPlease enter your salary==> ");
        salary=scanner.nextFloat();
        totalTax= IreCalculation.computeIre(salary);
        System.out.println("\nYour total tax to pay is: "+totalTax);
        
    }
}
