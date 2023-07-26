package utils;
/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
class Series {
    public static long computeFactorial(int n) {
        long total = 1;
        if (n < 0) {
            n = n * (-1);
            for (int i = 1; i <= n; i++) {
                total = total * i;
            }
            total = total * (-1);
        }else{
            for (int i = 1; i <= n; i++) {
                total = total * i;
            }
        }
        return total;
    }
    
    public static int computeDivergence(int n){
        int total = 1;
        int increase = 1;
        int sign = 1;
        while(increase < n){
            if(increase < n){
                sign = sign * (-1);
                increase = increase + 1;
                if(increase < n){
                    total = total + 1;
                    sign = sign * (-1);
                    increase = increase + 1;
                }
            }
        }
        total = total * sign;
        return total;
    }
}
