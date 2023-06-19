
package ec.edu.espe.liquor.model;

import static ec.edu.espe.tax.IncomeTax.computeIncome;
import java.util.Scanner;

/**
 *
 * @author Juan Rueda, The Encoders, DCCO-ESPE
 */
public class Taxes {
    public static void printIncome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your monthly salary?");
        double salary= sc.nextDouble();
        double tax = computeIncome(salary);
        System.out.println("Income tax to pay: " + tax);
    }
}
