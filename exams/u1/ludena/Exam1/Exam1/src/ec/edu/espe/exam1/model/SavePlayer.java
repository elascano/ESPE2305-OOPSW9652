
package ec.edu.espe.exam1.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Edison Ludeña. BugBuster, DCCP-ESPE
 */
public class SavePlayer {
    public static void savePlayerToJson(List<Player> players, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(players, writer);
            System.out.println("The Soccer Players were saved in " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    public static void allPlayers(List<Player> players) {
        for (Player player : players) {
            System.out.println("NAME: " + player.getName());
            System.out.println("AGE: " + player.getAge());
            System.out.println("ID: " + player.getId());
            System.out.println("TEAM,: " + player.getTeam());
            

        }
    }
    public  int countPlayer(List<Player> players) {
        return players.size();
    
    
}
}
