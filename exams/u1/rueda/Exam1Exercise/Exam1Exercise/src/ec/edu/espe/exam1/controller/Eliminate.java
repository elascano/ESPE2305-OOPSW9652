package ec.edu.espe.exam1.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.exam1.model.Topic;
import java.io.File;

import java.io.IOException;
import java.io.PrintWriter;



/**
 *
 * @author juan rueda, The encoders; DCCO-ESPE
 */

public class Eliminate {
    public void sasveInfo(Topic topic1) {
       Gson gson=new GsonBuilder().setPrettyPrinting().create();
       String gsonTopic1 = gson.toJson(Topics1);
        System.out.println("gsonTopic");
       try(PrintWriter printWriter = new PrintWriter(new File("./Data./Objects.json"))){
            printWriter.write(Topic1);
            System.out.println(" Save Data.");
        } catch (IOException e) {
            System.out.println("failed to save JSON: " + e.getMessage());
        }
    }
}







