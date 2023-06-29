package ec.edu.espe.hw12team1.view;

import ec.edu.espe.hw12team1.model.ConnectMongoDB;
import java.util.Scanner;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class MenuMongoDB {

    public static void main(String[] args) {
        int option;
        boolean exitMenu = false;
        Scanner sc = new Scanner(System.in);

        try {
            while (!exitMenu) {
                System.out.println("\n1. Insert new Computer");
                System.out.println("2. Find a Computer");
                System.out.println("3. Modify a Computer");
                System.out.println("4. Delete a Computer");
                System.out.println("5. Show everything computers");
                System.out.println("6. Exit");
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        ConnectMongoDB.createDocument();
                        break;
                    case 2:
                        ConnectMongoDB.readDocument();
                        break;
                    case 3:
                        ConnectMongoDB.modifyDocument();
                        break;
                    case 4:
                        ConnectMongoDB.deleteDocument();
                        break;
                    case 5:
                        ConnectMongoDB.showDatabase();
                        break;
                    case 6:
                        exitMenu = true;
                        break;
                    default:
                        System.out.println("Please enter values from 1 to 5");
                        option = sc.nextInt();
                }
            }
        } catch (Exception e) {
            System.out.println("Incorrect Value");
        }

    }
}
