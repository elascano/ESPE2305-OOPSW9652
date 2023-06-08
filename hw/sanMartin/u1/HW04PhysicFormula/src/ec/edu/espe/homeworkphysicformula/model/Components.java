
package ec.edu.espe.homeworkphysicformula.model;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class Components {
    private float initialVelocity;
    private float acceleration;
    private float distance;
    private double finalVelocity;

    public Components(float initialVelocity, float acceleration, float distance, double finalVelocity) {
        this.initialVelocity = initialVelocity;
        this.acceleration = acceleration;
        this.distance = distance;
        this.finalVelocity = finalVelocity;
        
       
    }

    @Override
    public String toString() {
        return "Components{" + "initialVelocity=" + initialVelocity + ", acceleration=" + acceleration + ", distance=" + distance + ", finalVelocity=" + finalVelocity + '}';
    }
    public String toCSV(){
        return this.initialVelocity+","+this.acceleration+","+this.distance+","+this.finalVelocity;
    }

    public float getInitialVelocity() {
        return initialVelocity;
    }

    public void setInitialVelocity(float initialVelocity) {
        this.initialVelocity = initialVelocity;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public double getFinalVelocity() {
        return finalVelocity;
    }

    public void setFinalVelocity(double finalVelocity) {
        this.finalVelocity = finalVelocity;
    }

    
    
    
    
}
