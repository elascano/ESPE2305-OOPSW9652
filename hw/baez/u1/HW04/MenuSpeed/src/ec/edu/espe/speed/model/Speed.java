package ec.edu.espe.speed.model;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class Speed {
    public static void main(String[] args){
        float initialSpeed=10;
        float acceleration=5;
        float time=15;
        float speed;
        speed=computeSpeed(initialSpeed, acceleration, time);
    }
    
    
    public static float computeSpeed(float initialSpeed, float acceleration, float time){
        float speed;
        speed = initialSpeed+(acceleration*time);
        return speed;
    
    }
}
