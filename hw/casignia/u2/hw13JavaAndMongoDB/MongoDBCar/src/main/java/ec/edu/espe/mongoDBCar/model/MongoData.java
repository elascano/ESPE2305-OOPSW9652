package ec.edu.espe.mongoDBCar.model;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;
import java.util.Scanner;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class MongoData {

    public static void createData() {
        String uri = "mongodb+srv://gcalvache:gcalvache@cluster0.qsalyjy.mongodb.net/?retryWrites=true&w=majority";
        Scanner readData = new Scanner(System.in);
        
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Objects");
            MongoCollection<Document> collection = database.getCollection("Car");

            System.out.print("Id: ");
            int id = readData.nextInt();
            System.out.print("Brand: ");
            String brand = readData.next();
            System.out.print("Color:");
            String color = readData.next();
            System.out.print("Price:");
            int price = readData.nextInt();
            
            while (price <= -1) {
                System.out.println("Not valid Price");
                System.out.print("Price:");
                price = readData.nextInt();
            }

            Document doc1 = new Document("Id", id).append("Color", color).append("Brand", brand).append("Price", price);

            InsertOneResult result = collection.insertOne(doc1);
            System.out.println("Inserted a document with the following id: "
                    + result.getInsertedId().asObjectId().getValue());
        }
    }

    public static void deleteData() {
        String uri = "mongodb+srv://gcalvache:gcalvache@cluster0.qsalyjy.mongodb.net/?retryWrites=true&w=majority";
        Scanner readData = new Scanner(System.in);
        
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Objects");
            MongoCollection<Document> collection = database.getCollection("Car");

            System.out.println("Insert Id to delete");
            int del = readData.nextInt();
            Bson filter = Filters.eq("Id", del);
            collection.deleteOne(filter);
            System.out.println("Id Deleted");
        }
    }

    public static void readData() {
        String uri = "mongodb+srv://gcalvache:gcalvache@cluster0.qsalyjy.mongodb.net/?retryWrites=true&w=majority";
        Scanner readData = new Scanner(System.in);
        
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Objects");
            MongoCollection<Document> collection = database.getCollection("Car");

            System.out.println("Insert the Id of the car you want to see");
            int search = readData.nextInt();
            MongoCursor<Document> cursor = collection.find(eq("Id", search)).cursor();

            try {
                while (cursor.hasNext()) {
                    System.out.println(cursor.next().toJson());
                }
            } finally {
                cursor.close();
            }
        }
    }

    public static void modifyData() {
        String uri = "mongodb+srv://gcalvache:gcalvache@cluster0.qsalyjy.mongodb.net/?retryWrites=true&w=majority";
        Scanner readData = new Scanner(System.in);
        
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Objects");
            MongoCollection<Document> collection = database.getCollection("Car");

            System.out.println("Insert the Id of the car to modify");
            int search = readData.nextInt();
            Document docmod = collection.find(eq("Id", search)).first();
            System.out.println("Please insert the new information:");


            System.out.print("Brand: ");
            String brand = readData.next();
            System.out.print("Color:");
            String color = readData.next();
            System.out.print("Price:");
            int price = readData.nextInt();
            
            while (price <= -1) {
                System.out.println("Not valid Price");
                System.out.print("Price:");
                price = readData.nextInt();
            }

            Document doc1 = new Document("Color", color).append("Brand", brand).append("Price", price);
            UpdateResult result = collection.replaceOne(docmod, doc1);
            System.out.println("Matched document count: " + result.getMatchedCount());
            System.out.println("Modified document count: " + result.getModifiedCount());
        }

    }

    public static void showAllCar() {
        String uri = "mongodb+srv://gcalvache:gcalvache@cluster0.qsalyjy.mongodb.net/?retryWrites=true&w=majority";
        Scanner readData = new Scanner(System.in);
        
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Objects");
            MongoCollection<Document> collection = database.getCollection("Car");

            MongoCursor<Document> cursor = collection.find().cursor();

            try {
                while (cursor.hasNext()) {
                    System.out.println(cursor.next().toJson());
                }
            } finally {
                cursor.close();
            }
        }
    }
}
