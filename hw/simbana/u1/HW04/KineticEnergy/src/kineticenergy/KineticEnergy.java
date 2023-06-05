package kineticenergy;
/**
 *
 * @author Michael Simbaña
 */
public class KineticEnergy {

    private int mass;
    private int speed;
    private int constant;
    private int square_of_velocity;
    private float kinetic_energy;

    public KineticEnergy(int mass, int speed, int constant, int square_of_velocity, float kinetic_energy) {
        this.mass = mass;
        this.speed = speed;
        this.constant = constant;
        this.square_of_velocity = square_of_velocity;
        this.kinetic_energy = kinetic_energy;
    }

    @Override
    public String toString() {
        return "KineticEnergy{" + "mass=" + mass + ", speed=" + speed + ", constant=" + constant + ", square_of_velocity=" + square_of_velocity + ", kinetic_energy=" + kinetic_energy + '}';
    }
    public String toCSV() {
        return this.mass + ";" + this.speed + ";" + this.constant + ";" + this.square_of_velocity + ";" + this.kinetic_energy;
    }

    public int getMass() {
        return mass;
    }

    /**
     * @param mass the mass to set
     */
    public void setMass(int mass) {
        this.mass = mass;
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return the constant
     */
    public int getConstant() {
        return constant;
    }

    /**
     * @param constant the constant to set
     */
    public void setConstant(int constant) {
        this.constant = constant;
    }

    /**
     * @return the square_of_velocity
     */
    public int getSquare_of_velocity() {
        return square_of_velocity;
    }

    /**
     * @param square_of_velocity the square_of_velocity to set
     */
    public void setSquare_of_velocity(int square_of_velocity) {
        this.square_of_velocity = square_of_velocity;
    }

    /**
     * @return the kinetic_energy
     */
    public float getKinetic_energy() {
        return kinetic_energy;
    }

    /**
     * @param kinetic_energy the kinetic_energy to set
     */
    public void setKinetic_energy(float kinetic_energy) {
        this.kinetic_energy = kinetic_energy;
    }
}
