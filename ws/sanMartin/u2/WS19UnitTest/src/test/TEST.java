
package test;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;
/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class TEST {

  public  String validateName(JTextField textField) {
        String cadena = textField.getText();
        
        String patron = "^[a-zA-ZñÑ, ]+$";


        Pattern pattern = Pattern.compile(patron);

      
        Matcher matcher = pattern.matcher(cadena);

       
        if (matcher.matches()) {
            return cadena;
        } else {
            return null;
        }
    }
   public  String validateEmail(JTextField textField) {
        String inputString = textField.getText();
        
   
        String pattern = "^[a-zA-ZñÑ]+@[a-zA-ZñÑ]+\\.[a-zA-ZñÑ]+$";

     
        Pattern regexPattern = Pattern.compile(pattern);

    
        Matcher matcher = regexPattern.matcher(inputString);

        
        if (matcher.matches()) {
            return inputString;
        } else {
            return null;
        }
    }
   public  String validateNumber(JTextField textField) {
        String inputString = textField.getText();
        
        
        if (inputString.matches("[0-9]{1,10}")) {
            return inputString;
        } else {
            return null;
        }
    }
   
    
}
