
package ec.edu.espe.serie.utils;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class Operation {
    
    public static int calculateFactorial(int n) {
        int factorial = 1;    
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
        return factorial;
    }
       
    
    public static int computeDivergence(int n){
             
        if(n%2==0){
            return -n/2;
        }else{
            return (n+1)/2;
        }
        }
       
}
