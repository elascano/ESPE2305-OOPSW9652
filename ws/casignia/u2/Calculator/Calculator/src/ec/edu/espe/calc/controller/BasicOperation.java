package ec.edu.espe.calc.controller;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class BasicOperation {
    public float add(float addend1, float addend2){
        float sum;
        sum = addend1 + addend2;
        return sum;
    }
    
    public float subtract(float minuend, float subtrahend){
        float difference;
        difference = minuend - subtrahend;
        return difference;
    }
}
