
package ec.edu.espe.chickenfarm.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.chickenfarm.model.Coop;
import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class SaveChicken {
    
    public void SaveChicken(Coop coop1, Coop coop2){
        
        Gson gson = new GsonBuilder().create();
        String gsonCoop1 = gson.toJson(coop1);
        String gsonCoop2 = gson.toJson(coop2);
        System.out.println(gsonCoop1);
        System.out.println(gsonCoop2);
        
        try(PrintWriter printWriter = new PrintWriter(new File("dataInfo.json"))){
            printWriter.write(gsonCoop1);
            printWriter.write(gsonCoop2);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    
    }
 
}
