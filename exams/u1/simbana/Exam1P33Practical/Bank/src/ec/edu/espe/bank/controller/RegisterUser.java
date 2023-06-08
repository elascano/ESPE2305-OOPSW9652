
package ec.edu.espe.bank.controller;

import ec.edu.espe.bank.model.User;
import java.util.Scanner;
import javax.xml.validation.Validator;

/**
 *
 * @author Michael Simbana, POO-ERATION-GOSLING, DCCO-ESPE
 */
public class RegisterUser {
    public User readFile(){
    Scanner readFile = new Scanner(System.in);
        System.out.print("Id: ");
        String id = readFile.next();
        int idInt = Integer.parseInt(id);
        
      
        System.out.print("Name: ");
        String name = readFile.next();


        System.out.print("Age: ");
        String age = readFile.next();
        int ageint = Integer.parseInt(age);
        
        User user = new User(idInt,name,ageint);
        return user;
}
}
