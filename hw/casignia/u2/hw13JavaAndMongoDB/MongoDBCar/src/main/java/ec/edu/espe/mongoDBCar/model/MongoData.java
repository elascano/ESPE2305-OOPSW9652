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

    public static void readData() {
        //String uri = "mongodb+srv://gcalvache:gcalvache@cluster0.qsalyjy.mongodb.net/?retryWrites=true&w=majority";
        String uri = "mongodb+srv://dacasignia:dacasignia@cluster0.cfz6ogt.mongodb.net/?retryWrites=true&w=majority";
        Scanner readData = new Scanner(System.in);
        
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Quiz");
            MongoCollection<Document> collection = database.getCollection("Students");

            System.out.println("Insert the Id of the student you want to see");
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

    public static void showStudent() {
        String uri = "mongodb+srv://dacasignia:dacasignia@cluster0.cfz6ogt.mongodb.net/?retryWrites=true&w=majority";
        Scanner readData = new Scanner(System.in);
        
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Quiz");
            MongoCollection<Document> collection = database.getCollection("Students");

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
