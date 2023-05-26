package ec.edu.espe.displacementformula.model;

import java.util.Scanner;

/**
 * author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class Position {
    private float initialPosition;
    private float finalPosition;
    private static Scanner scanner = new Scanner(System.in);

    public void readData() {
        System.out.println("Enter the initial position: ");
        initialPosition = scanner.nextFloat();
        System.out.println("Enter the final position: ");
        finalPosition = scanner.nextFloat();
    }

    public float getInitialPosition() {
        return initialPosition;
    }

    public float getFinalPosition() {
        return finalPosition;
    }
}

