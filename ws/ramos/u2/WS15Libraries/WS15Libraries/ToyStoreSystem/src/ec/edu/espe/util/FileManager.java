
package ec.edu.espe.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.model.ActionFigure;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class FileManager {
    
    public void addFigure(){
       List<ActionFigure> actionFigures = new ArrayList<>();
       Scanner data = new Scanner(System.in);
        System.out.println("Write id of the Figure: ");
        int id = data.nextInt();
        System.out.println("Write the character Namer: ");
        String character = data.next();
        System.out.println("Write height of the Figure: ");
        int height = data.nextInt();
        System.out.println("Write weight of the Figure: ");
        int weight = data.nextInt();
        ActionFigure actionfigure = new ActionFigure(id, character, height, weight);
        actionFigures.add(actionfigure);
        saveFigures(actionFigures, "actionFigures.json");
    }
     public static void saveFigures(List<ActionFigure> actionFigures, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
        Gson gson = new Gson();
        String json = gson.toJson(actionFigures);
        writer.write(json);
        System.out.println("Objeto serializado y guardado en action_figure.json");
        } catch (IOException e) {
        e.printStackTrace();
                }
     }
 
    
}
