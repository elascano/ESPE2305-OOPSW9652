package ec.edu.espe.view;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.model.Boat;
import org.bson.Document;

import java.util.Scanner;

public class Main {
    private static MongoClient mongoClient;
    private static MongoDatabase database;
    private static MongoCollection<Document> collection;

    public static void main(String[] args) {
        // Conectarse a la base de datos
        connectToDatabase();

        // Solicitar al usuario que ingrese los datos del libro
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----- MENU-----");
            System.out.println("1. Add Boats");
            System.out.println("2. Find Boat");
            System.out.println("3. Update Boat");
            System.out.println("4. Delete Boat");
            System.out.println("5. Show All Boat");
            System.out.println("0. Exit");
            System.out.print("Enter an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Limpiar el búfer de entrada

            switch (choice) {
                case 1:
                    createBoat(scanner);
                    break;
                case 2:
                    readBoat();
                    break;
                case 3:
                    updateBoat(scanner);
                    break;
                case 4:
                    deleteBoat(scanner);
                    break;
                case 5:
                    readAllBoat();
                    break;
                case 0:
                    System.out.println("Leaving the program...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }

            System.out.println();
        } while (choice != 0);

        // Cerrar la conexión a la base de datos
        closeConnection();
    }

    private static void connectToDatabase() {
        mongoClient = new MongoClient(new MongoClientURI("mongodb+srv://stevenriva21:stevenriva21@cluster0.skbktne.mongodb.net/?retryWrites=true&w=majority"));
        database = mongoClient.getDatabase("HW");
        collection = database.getCollection("Boat");
    }

    private static void createBoat(Scanner scanner) {
        System.out.print("Enter the boat ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Clear input buffer
        System.out.print("Enter the boat color: ");
        String color = scanner.nextLine();
        System.out.print("Enter the boat brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter the boat status: ");
        String status = scanner.nextLine();

        Boat boat = new Boat(id, color, brand, status);
        insertDocument(boat);
    }
    
    private static void readAllBoat() {
        MongoCursor<Document> cursor = collection.find().iterator();

        System.out.println("Boats found:");
        while (cursor.hasNext()) {
            Document document = cursor.next();
            int id = document.getInteger("id");
            String color = document.getString("color");
            String brand = document.getString("brandMark");
            String status = document.getString("status");

            Boat boat = new Boat(id, color, brand, status);
            System.out.println(boat);
        }

        cursor.close();
    }

    private static void insertDocument(Boat boat) {
        Document document = new Document("id", boat.getId())
                .append("color", boat.getColor())
                .append("brandMark", boat.getBrandMark())
                .append("status", boat.getStatus());

        collection.insertOne(document);
        System.out.println("Document inserted: " + boat);
    }

    private static void readBoat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ID of the boat to search: ");
        int id = scanner.nextInt();

        Document query = new Document("id", id);
        Document result = collection.find(query).first();

        if (result != null) {
            int boatId = result.getInteger("id");
            String color = result.getString("color");
            String brand = result.getString("brandMark");
            String status = result.getString("status");

            Boat boat = new Boat(boatId, color, brand, status);
            System.out.println("Boat found:");
            System.out.println(boat);
        } else {
            System.out.println("Boat not found.");
        }
    }

    private static void updateBoat(Scanner scanner) {
        System.out.print("Enter the ID of the boat to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Clear input buffer
        System.out.print("Enter the new color of the boat: ");
        String color = scanner.nextLine();
        System.out.print("Enter the new brand of the boat: ");
        String brand = scanner.nextLine();
        System.out.print("Enter the new status of the boat: ");
        String status = scanner.nextLine();

        // Create the filter to find the boat to update
        Document filter = new Document("id", id);

        // Create the document with the new data
        Document update = new Document("$set", new Document("color", color)
                .append("brandMark", brand)
                .append("status", status));

        // Update the document
        collection.updateOne(filter, update);
        System.out.println("Boat updated successfully.");
    }

    private static void deleteBoat(Scanner scanner) {
        System.out.print("Enter the ID of the boat to delete: ");
        int id = scanner.nextInt();

        // Create the filter to find the boat to delete
        Document filter = new Document("id", id);

        // Delete the document
        collection.deleteOne(filter);
        System.out.println("Boat deleted successfully.");
    }

    private static void closeConnection() {
        mongoClient.close();
    }
}