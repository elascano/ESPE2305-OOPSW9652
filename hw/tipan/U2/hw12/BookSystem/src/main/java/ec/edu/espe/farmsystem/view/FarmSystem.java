
package ec.edu.espe.farmsystem.view;
import static com.mongodb.client.model.Filters.eq;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.farmsystem.controller.BookController;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author PabloEZurita
 */
public class FarmSystem {
    
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcionOfMenu;
        do {
            System.out.println("------- Books System -------");
            System.out.println("Choose an opcion:");
            System.out.println("1.- Add a book");
            System.out.println("2.- Modify a book");
            System.out.println("3.- Show the book");
            System.out.println("4.- Delet a book");
            System.out.println("5.- Exit");
            opcionOfMenu = checkEnteredData();
            switch(opcionOfMenu){
                case 1 -> BookController.addBook();
                case 2 -> BookController.updateBook();
                case 3 -> BookController.showBook();
                case 4 -> BookController.deletBook();
                case 5 -> System.out.println("Exit the program");
                default -> System.out.println("Enter a number between 1 and 5");             
            }     
        } while (opcionOfMenu!=5);  
    }
    
    
    
    private static void quickClass(){
        String uri = "mongodb+srv://pzurita:pzurita@cluster0.ohfzkul.mongodb.net/?retryWrites=true&w=majority";

        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Farm");
            MongoCollection<Document> collection = database.getCollection("Bees");

            Document doc = collection.find(eq("id",1)).first();
            if (doc != null) {
                System.out.println(doc.toJson());
            } else {
                System.out.println("No matching documents found.");
            }  
        }
    }
    
    private static int checkEnteredData() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine(); 
                System.out.println("Enter a valid integer number");
            }
        }
    }
}
