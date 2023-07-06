
package ec.edu.espe.serie;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class Serie {
    
    
    public static void computeFibonacci(int serie) {
        int num1 = 0;
        int num2 = 1;

        // Mostrar los primeros dos números de la serie
        System.out.println(num1);
        System.out.println(num2);

        for (int i = 2; i < serie; i++) {
            int suma = num1 + num2;

            // Mostrar la suma
            System.out.println(suma);

            num1 = num2;
            num2 = suma;
        }
    }
    
    
    public static int computeDivergence(int n){
        switch (n) {
            case 1:
                n = n + 1;
                break;
            case 2:
                n = -2 + 1;
                break;
            case 3:
                n = n - 1;
                break;
            case 4:
                n = -4 + 2;
                break;
            case 5:
                n = n - 2;
                break;
            case 6:
                n = -6 + 3;
                break;
            default:
                break;
        }
        return n;
    }
    
    public static int computeDivergence2(int n) {
    if (n % 2 == 0) {
        return -n/2 + n/3;
    } else {
        return n/2 - n/3;
    }
}
    
}
