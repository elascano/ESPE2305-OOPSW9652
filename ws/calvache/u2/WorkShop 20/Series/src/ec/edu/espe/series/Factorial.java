package ec.edu.espe.series;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class Factorial {

   
    public static int calculateFactorial(int number) {

        int startFactorial = 1;

        if (number < 0) {
            System.out.println("Number must be positive");;
        }

        for (int i = 1; i <= number; i++) {
            startFactorial *= i;
        }

        return startFactorial;
    }
}
