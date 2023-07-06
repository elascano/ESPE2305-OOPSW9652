
package unitTestPackages;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class TestCalculator {
    public static int calculateFactorial(int n){
        int factorial = 1;
        for (int i =1;i<=n;i++){
            factorial *= i;
        }
        return factorial;
    } 
    
    public static int calculateSerie(int n){
         if (n % 2 == 0) {
            return -n / 2;
        } else {
            return (n + 1) / 2;
        }
    }
}
