package ec.edu.espe.hw12team1.model;

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
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class ConnectMongoDB {

    public static void createDocument() {

        String uri = "mongodb+srv://techware:techware@cluster1.catv1fd.mongodb.net/?retryWrites=true&w=majority";
        Scanner readData = new Scanner(System.in);
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("dbmongo");
            MongoCollection<Document> collection = database.getCollection("computers");

            System.out.print("id: ");
            int id = readData.nextInt();
            System.out.print("color: ");
            String color = readData.next();
            System.out.print("Price: ");
            float price = readData.nextFloat();
            while (price <= -1) {
                System.out.println("No allowed");
                System.out.print("Price:");
                price = readData.nextFloat();
            }
            System.out.print("Brand: ");
            String brand = readData.next();

            Document doc1 = new Document("id", id).append("color", color).append("price", price).append("brand", brand);

            InsertOneResult result = collection.insertOne(doc1);
            System.out.println("Inserted a document with the following id: "
                    + result.getInsertedId().asObjectId().getValue());
        }
    }

    public static void deleteDocument() {
        String uri = "mongodb+srv://techware:techware@cluster1.catv1fd.mongodb.net/?retryWrites=true&w=majority";
        Scanner readData = new Scanner(System.in);
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("dbmongo");
            MongoCollection<Document> collection = database.getCollection("computers");

            System.out.println("What id you Want delete?");
            int del = readData.nextInt();
            Bson filter = Filters.eq("id", del);
            collection.deleteOne(filter);
            System.out.println("Deleted Succesfull");
        }
    }

    public static void readDocument() {
        String uri = "mongodb+srv://techware:techware@cluster1.catv1fd.mongodb.net/?retryWrites=true&w=majority";
        Scanner readData = new Scanner(System.in);
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("dbmongo");
            MongoCollection<Document> collection = database.getCollection("computers");

            System.out.println("What id you want to view?");
            int search = readData.nextInt();
            MongoCursor<Document> cursor = collection.find(eq("id", search)).cursor();

            try {
                while (cursor.hasNext()) {
                    System.out.println(cursor.next().toJson());
                }
            } finally {
                cursor.close();
            }
        }
    }

    public static void modifyDocument() {
        String uri = "mongodb+srv://techware:techware@cluster1.catv1fd.mongodb.net/?retryWrites=true&w=majority";
        Scanner readData = new Scanner(System.in);
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("dbmongo");
            MongoCollection<Document> collection = database.getCollection("computers");

            System.out.println("What ID you want to modify?");
            int search = readData.nextInt();
            Document docmod = collection.find(eq("id", search)).first();
            System.out.println("Please insert new data:");

            System.out.print("id: ");
            int id = readData.nextInt();
            System.out.print("color: ");
            String color = readData.next();
            System.out.print("Price: ");
            float price = readData.nextFloat();
            while (price <= -1) {
                System.out.println("No allowed");
                System.out.print("Price:");
                price = readData.nextFloat();
            }
            System.out.print("Brand: ");
            String brand = readData.next();
            
            Document doc1 = new Document("id", id).append("color", color).append("price", price).append("brand", brand);

            UpdateResult result = collection.replaceOne(docmod, doc1);
            System.out.println("Matched document count: " + result.getMatchedCount());
            System.out.println("Modified document count: " + result.getModifiedCount());
        }

    }

    public static void showDatabase() {
        String uri = "mongodb+srv://techware:techware@cluster1.catv1fd.mongodb.net/?retryWrites=true&w=majority";
        Scanner readData = new Scanner(System.in);
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("dbmongo");
            MongoCollection<Document> collection = database.getCollection("computers");

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
