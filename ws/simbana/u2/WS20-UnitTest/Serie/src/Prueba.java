
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class Prueba {
    public static int Fibo(int n){

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a limit for de serie: ");
            int limit = scanner.nextInt();

            System.out.println("fibonacci serie: ");
            for (int i = 0; i < limit; i++) {
                System.out.print(limit(i) + " ");
            }

            scanner.close();
        return n;
        }

    private static int limit(int n) {
        
        if (n <= 1) {
            return n;
        } else {
            return limit(n - 1) + limit(n - 2);
        }
    }
    
}
