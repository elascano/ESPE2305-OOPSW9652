
package ec.edu.espe.series.view;

import java.util.Scanner;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class Fibonnacci {
    public static int Fibo(int n){

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a limit for de serie: ");
            int limit = scanner.nextInt();

            System.out.println("fibonacci serie: ");
            for (int i = 0; i < limit; i++) {
                System.out.print(limit(i) + " ");
            }

            scanner.close();
        return limit;
        }

    
    static int limit(int n) {
        
        if (n <= 1) {
            return n;
        } else {
            return limit(n - 1) + limit(n - 2);
        }
    }
}

