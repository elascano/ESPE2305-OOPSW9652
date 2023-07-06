
package Utils;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Series {
    public static int calculateDivergence(int num) {
        String numString = String.valueOf(num); 
        int divergence = 0;
        for (int i = 0; i < numString.length() - 1; i++) {
            int num1 = Character.getNumericValue(numString.charAt(i)); 
            int num2 = Character.getNumericValue(numString.charAt(i + 1));
            int diference = Math.abs(num1 - num2); 
            divergence += diference; 
        }
        
        return divergence;
    }


}
