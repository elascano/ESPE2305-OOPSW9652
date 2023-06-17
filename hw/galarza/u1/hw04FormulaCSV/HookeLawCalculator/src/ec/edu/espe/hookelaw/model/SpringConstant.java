package ec.edu.espe.hookelaw.model;

import java.util.Scanner;

/**
 *
 * @author Cesar Galarza, BugBusters, DCCO-ESPE
 */
public class SpringConstant {

    private float force;
    private float distance;
    private float springConstant;
    
    
    public void doStuff() {
        computeSpringConstant(98, 37);
        printLines(98, 37, computeSpringConstant(98, 37));
    }
    
    public static float computeSpringConstant (float force, float distance){
		float springConstant;
		springConstant = force/distance;
		return springConstant;
	}
    
    public static void printLines (float force, float distance, float spring){
        System.out.println("\nUnknow elastic constant");
        System.out.println("k = dF/dx = " + force + "/" + distance);
        System.out.println("k = " + spring + "[N/m]");
    }
    
    public static float insertForce(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Insert force change in newtons:");
        float force = sn.nextFloat();
        return force;
    }
    
    public static float insertDistance(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Insert distance change in meters:");
        float distance = sn.nextFloat();
        return distance;
    }
    
    /**
     * @return the force
     */
    public float getForce() {
        return force;
    }

    /**
     * @param force the force to set
     */
    public void setForce(float force) {
        this.force = force;
    }

    /**
     * @return the distance
     */
    public float getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(float distance) {
        this.distance = distance;
    }
    
    /**
     * @return the springConstant
     */
    public float getSpringConstant() {
        return springConstant;
    }

    /**
     * @param springConstant the springConstant to set
     */
    public void setSpringConstant(float springConstant) {
        this.springConstant = springConstant;
    }
}
