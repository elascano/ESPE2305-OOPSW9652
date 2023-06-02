package ec.edu.espe.chickenfarm.view;

import ec.edu.espe.chikenfarm.model.Chicken;
import ec.edu.espe.chikenfarm.model.Coop;
import ec.edu.espe.chikenfarm.model.Egg;
import ec.edu.espe.chikenfarm.model.Poop;
import java.util.ArrayList;
import java.util.Date;

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
        Coop coop;
        Coop coop2;

        System.out.println("---Chicken Farm by Gabriel Calvache---");
        System.out.println("chickens size--> " + chickens.size());

        egg = new Egg(0);
        chiken = new Chicken(1, "Lucy", "W&B", false, new Date(70, 11, 17));
        chickens.add(chiken);
        poop = new Poop(chiken.getId());

        System.out.println("Chicken--> " + chiken);
        System.out.println("chickens size --> " + chickens.size());

        chiken = new Chicken(2, "Maruja", "W", true, new Date(70, 11, 12));
        chickens.add(chiken);
        System.out.println("Chicken--> " + chiken);
        System.out.println("chickens size --> " + chickens.size());

        chiken = new Chicken(3, "Rigoberta", "B", true, new Date(89, 10, 24));
        chickens.add(chiken);
        System.out.println("Chicken--> " + chiken);
        System.out.println("chickens size --> " + chickens.size());

        chiken = new Chicken(4, "Martisia", "R", true, new Date(95, 7, 21));
        chickens.add(chiken);
        System.out.println("Chicken--> " + chiken);
        System.out.println("chickens size --> " + chickens.size());

        chiken = new Chicken(5, "Penelope", "O", true, new Date(87, 0, 14));
        chickens.add(chiken);
        System.out.println("Chicken--> " + chiken);
        System.out.println("chickens size --> " + chickens.size());

        coop = new Coop(1, chickens);
        System.out.println("All chickens --> " + chickens);

        coop2 = new Coop(2, chickens2);
        //System.out.println("coop --> " + coop);

        chiken = new Chicken(1, "Maricela", "W", true, new Date(90, 11, 17));
        chickens2.add(chiken);
        System.out.println("\nChicken2--> " + chiken);
        System.out.println("chickens2 size --> " + chickens2.size());

        chiken = new Chicken(2, "Juana", "W", true, new Date(97, 12, 29));
        chickens2.add(chiken);
        System.out.println("Chicken2--> " + chiken);
        System.out.println("chickens2 size --> " + chickens2.size());

        chiken = new Chicken(3, "Emilia", "B", true, new Date(93, 1, 23));
        chickens2.add(chiken);
        System.out.println("Chicken2--> " + chiken);
        System.out.println("chickens2 size --> " + chickens2.size());

        chiken = new Chicken(4, "Pepa", "W&BR", true, new Date(99, 7, 12));
        chickens2.add(chiken);
        System.out.println("Chicken2--> " + chiken);
        System.out.println("chickens2 size --> " + chickens2.size());

        chiken = new Chicken(5, "Ariela", "O", true, new Date(98, 8, 3));
        chickens2.add(chiken);

        System.out.println("Chicken2--> " + chiken);
        System.out.println("chickens2 size --> " + chickens2.size());
        System.out.println("All chickens2 --> " + chickens2);

    }

}
