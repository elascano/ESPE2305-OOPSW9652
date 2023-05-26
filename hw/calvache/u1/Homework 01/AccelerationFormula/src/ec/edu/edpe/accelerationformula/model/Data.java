package ec.edu.edpe.accelerationformula.model;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class Data {

    private float initialVelocity;
    private float finalVelocity;
    private float time;
    private float acceleration;
    

    public Data(float initialVelocity, float finalVelocity, float time, float acceleration) {
        this.initialVelocity = initialVelocity;
        this.finalVelocity = finalVelocity;
        this.time = time;
        this.acceleration = acceleration;
    }

    @Override
    public String toString() {
        return "Data{" + "initialVelocity=" + initialVelocity + ", finalVelocity=" + finalVelocity + ", time=" + time + ", acceleration=" + acceleration + '}';
    }

    public String toCSV() {
        return this.initialVelocity + "," + this.finalVelocity + "," + this.time + "," + this.acceleration;
    }

    public float getInitialVelocity() {
        return initialVelocity;
    }

    public void setInitialVelocity(float initialVelocity) {
        this.initialVelocity = initialVelocity;
    }

    public float getFinalVelocity() {
        return finalVelocity;
    }

    public void setFinalVelocity(float finalVelocity) {
        this.finalVelocity = finalVelocity;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }



}
