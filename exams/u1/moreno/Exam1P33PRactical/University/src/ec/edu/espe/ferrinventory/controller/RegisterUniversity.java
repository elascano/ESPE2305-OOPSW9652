package ec.edu.espe.ferrinventory.controller;

import ec.edu.espe.ferrinventory.model.University;
import java.util.Scanner;


/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class RegisterUniversity {
    public University University(){
        Scanner readData = new Scanner(System.in);
        System.out.print("Nombre de la Universidad:");
        String name = readData.nextLine();
        System.out.print("Ubicacion de la universidad(Pais): ");
        String ubication = readData.nextLine();
        System.out.print("Numero de Extenciones:");
        int stock = readData.nextInt();
        while (stock<=-1){
            System.out.println("Dato invalido");     
            System.out.print("Stock:");
            stock = readData.nextInt();             
        }      
        University university=new University(name, ubication, stock);
        return university;
    }
    
}
