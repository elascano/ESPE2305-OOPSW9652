package ec.edu.espe.sportstore.model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cesar Galarza, BugBusters, DCCO-ESPE
 */
public class CreateSport {
    public Sport Sport(){
        ArrayList<Sport> sports = new ArrayList<>();
        Scanner createSport = new Scanner(System.in);

        System.out.print("\nId: ");
        int id = createSport.nextInt();
        System.out.print("Name: ");
        String name = createSport.next();
        System.out.print("The sport use ball? (True or False): ");
        boolean useBall = createSport.nextBoolean();
        
        Sport sport =new Sport(id,name,useBall);
        sports.add(sport);
        return sport;
    }
}
