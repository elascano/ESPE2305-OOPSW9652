package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chickenfarm.controller.CreateGson;
import ec.edu.espe.chikenfarm.model.Chicken;
import ec.edu.espe.chikenfarm.model.Coop;
import ec.edu.espe.chikenfarm.model.Egg;
import ec.edu.espe.chikenfarm.model.Information;
import ec.edu.espe.chikenfarm.model.Menu;
import ec.edu.espe.chikenfarm.model.Poop;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

//LocalTime, Calendar, LocalDate, LocalDateTime instead of Date
/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class ChickenFarm {

    public static void main(String[] args) {
        Poop poop;
        Egg egg;
        Chicken chiken;
        ArrayList<Chicken> chickens = new ArrayList<>();
        ArrayList<Chicken> chickens2 = new ArrayList<>();
        Menu menu = new Menu();
        Information information = new Information();
        CreateGson createGson = new CreateGson();
        
        int loop = 1;
        while(loop == 1){
            int option = menu.main();
            switch (option){
                case 1:
                    chiken = information.iformationChicken();
                    chickens.add(chiken);
                    break;
                case 2:
                    chiken = information.iformationChicken();
                    chickens2.add(chiken);
                    break;
                case 3:
                    Coop coop1 = new Coop(1, chickens);
                    Coop coop2 = new Coop(2, chickens2);
                    createGson.saveData(coop1, coop2);
                    break;
                default:
                    loop= 2;
                    break;
            }
        }
    }

}
