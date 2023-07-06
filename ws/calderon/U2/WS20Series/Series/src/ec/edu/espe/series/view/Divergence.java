
package ec.edu.espe.series.view;

import java.util.Scanner;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class Divergence {
    
    public static int Serie(int n ){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("The number is: " );
        divergentSeries(number);
        return n;

    }
    
    public static void divergentSeries(int num) {
        int result = 0; 

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                result -= i / 2; 
            } else {
                result += (i + 1) / 2; 
            }

            if (i == num) {
                System.out.println(result);
            }
        }
    }
}


