
package ec.edu.espe.physicformula.control;
import java.util.Scanner;
/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class Formula {
    private float inicialSpeed;
    private float acceleration;
    private float distance;
    
    public static void Calular(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("---FORMULA TO CALCULATE DE FINAL SPEED---");
        System.out.println("Please write the initial velocity in m/s: ");
        float initialSpeed = keyboard.nextFloat();
        System.out.println("Please write the acceleration in m/s^2: ");
        float acceleration = keyboard.nextFloat();
        System.out.println("Please write the distance in m: ");
        float distance = keyboard.nextFloat();
        
        double finalInitialSpeed = Math.pow(initialSpeed, 2);
        double partialAnswer = finalInitialSpeed + 2*acceleration*distance;
        double finalSpeed = Math.pow(partialAnswer, 0.5);
        
        System.out.println("The Final Speed is: "+ finalSpeed + " m/s^2");
    }
    public static void main(String[] args) {
        Calcular();
    }
}
