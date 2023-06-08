
package ec.edu.espe.bank.view;

import ec.edu.espe.bank.controller.RegisterUser;
import ec.edu.espe.bank.controller.RegisterUserRecord;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Michael Simbana, POO-ERATION, DCCO-ESPE
 */
public class Menu {
     public static void main(String[] args) throws IOException, FileNotFoundException, ParseException, org.json.simple.parser.ParseException {
       
        Scanner optionIn = new Scanner(System.in);
        int option;
        
        do {
            System.out.println("--------Sistema BancaWeb-------\n");
            System.out.println("1. Ingresar Usuario\n");
            System.out.println("2. Contar Usuarios\n");
            System.out.println("3. Salir\n");
            System.out.print("Seleccione una opción: ");
            option = optionIn.nextInt();

            switch (option) {
                case 1:
                    addUser();
                    break;
                case 2:
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    option =3;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (option != 2);
    }
      public static void addUser(){
        System.out.println("-------Registrar Usuarios-----\n");
        System.out.println("Ingrese los datos\n");
        
        RegisterUser registerUser = new RegisterUser();
        RegisterUserRecord registerUserRecord  = new RegisterUserRecord();      
        registerUserRecord.fileWritter(registerUser.readFile());
  

    }
}
