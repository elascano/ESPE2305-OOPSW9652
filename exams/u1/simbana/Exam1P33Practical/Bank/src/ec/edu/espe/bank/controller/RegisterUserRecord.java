
package ec.edu.espe.bank.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.bank.model.User;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Michael Simbana, POO-ERATION, DCCO-ESPE
 */
public class RegisterUserRecord {

      public void fileWritter(User user){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
    
        JSONParser parser = new JSONParser();
        
        try{
            String route = "data\\Users.json";
              
            Object arr = parser.parse(new FileReader(route));
            String newArray =gson.toJson(arr);
        
            BufferedWriter writer = new BufferedWriter(new FileWriter(route, false)); 
            writer.newLine();  //nueva linea!
            writer.write(newArray); //Escribe palabra
            writer.close();  //Cierra BufferedWriter 
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
