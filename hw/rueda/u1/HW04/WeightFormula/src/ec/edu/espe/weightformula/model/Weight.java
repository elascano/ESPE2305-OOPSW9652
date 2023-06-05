package ec.edu.espe.weightformula.model;

import java.util.Scanner;

/**
 * author Juan Rueda, Bug Busters, DCCO-ESPE
 */
public class Weight {
    private float mass;
    private float gravity;
    private static final Scanner scanner = new Scanner(System.in);

    public void readData() {
        System.out.println("Enter the mass: ");
        mass = scanner.nextFloat();
        System.out.println("Enter the gravity: ");
        gravity = scanner.nextFloat();
    }

    public float getMass() {
        return mass;
    }

    public float getGravity() {
        return gravity;
    }
}

