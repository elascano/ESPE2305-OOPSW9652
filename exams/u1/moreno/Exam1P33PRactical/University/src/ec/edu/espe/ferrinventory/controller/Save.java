
package ec.edu.espe.ferrinventory.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.ferrinventory.model.UniversityList;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class Save {
    public void saveWareHouse1(UniversityList wareHouse){
        Gson gson= new GsonBuilder().setPrettyPrinting().create();
        String gsonWareHouse=gson.toJson(wareHouse);
        System.out.println(gsonWareHouse);
        try {
            String routeWH1="data\\ListOfUniversity.json";
            
            try (FileWriter writer = new FileWriter(routeWH1,false)) {
                writer.write(gsonWareHouse);
            }       
        } catch (IOException e) {
        } 
    }
}
