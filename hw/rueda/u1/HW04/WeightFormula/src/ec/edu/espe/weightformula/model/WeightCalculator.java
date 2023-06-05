package ec.edu.espe.weightformula.model;

/**
 * author Juan Rueda , Bug Busters, DCCO-ESPE
 */
public class WeightCalculator {
    public static float calculateWeight(float mass, float gravity) {
        float weight = mass * gravity;
        return weight;
    }
}

