package ec.edu.espe.series;

import java.util.Scanner;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class Divergence {

    public static int doDivergence(int num) {
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
        return result;
    }
}
