
package ec.edu.espe.mongodbcrud.controller;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.result.InsertOneResult;
import com.mongodb.client.result.UpdateResult;
import java.util.*;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class CrudOptions {
   public static void createDocument(){
        String uri ="mongodb+srv://jmsanmartin:12345@cluster0.nfzl84s.mongodb.net/?retryWrites=true&w=majority";
        Scanner data = new Scanner(System.in);
        try(MongoClient mongoClient = MongoClients.create(uri)){
            MongoDatabase database = mongoClient.getDatabase("Airplanes");
            MongoCollection<Document> collection = database.getCollection("Airplanes");
            
        
        System.out.print("id: ");
        int id = data.nextInt();
        System.out.print("PilotName: ");
        String pilotName=data.next();
        System.out.print("model:");
        String model = data.next();
        System.out.print("Amount:");
        int amount = data.nextInt();
        while (amount<=-1){
            System.out.println("No allowed");     
            System.out.print("Amount:");
            amount = data.nextInt();             
        }

        Document doc1 = new Document("id", id).append("PilotName", pilotName).append
        ("model", model).append("Amount", amount);

        InsertOneResult result = collection.insertOne(doc1);
        System.out.println("Inserted a document with the following id: " 
            + result.getInsertedId().asObjectId().getValue());
        }
    }
    
    public static void deleteDocument(){
        String uri ="mongodb+srv://jmsanmartin:12345@cluster0.nfzl84s.mongodb.net/?retryWrites=true&w=majority";
        Scanner data = new Scanner(System.in);
        try(MongoClient mongoClient = MongoClients.create(uri)){
            MongoDatabase database = mongoClient.getDatabase("Airplanes");
            MongoCollection<Document> collection = database.getCollection("Airplanes");
            
            System.out.println("What id you Want delete?");
            int del =data.nextInt();
        Bson filter = Filters.eq("id",del);
        collection.deleteOne(filter);
            System.out.println("Deleted Succesfull");
    }
}
    public static void readDocument(){
        String uri ="mongodb+srv://jmsanmartin:12345@cluster0.nfzl84s.mongodb.net/?retryWrites=true&w=majority";
        Scanner data = new Scanner(System.in);
        try(MongoClient mongoClient = MongoClients.create(uri)){
            MongoDatabase database = mongoClient.getDatabase("Airplanes");
            MongoCollection<Document> collection = database.getCollection("Airplanes");
            
            System.out.println("What id you want to view?");
            int search =data.nextInt();
            MongoCursor<Document> cursor = collection.find(eq("id",search)).cursor();

            try {
                while (cursor.hasNext()){
                    System.out.println(cursor.next().toJson());
                }
            } finally {
                cursor.close();
            }
        }
    }
    
    public static void modifyDocument(){
        String uri ="mongodb+srv://jmsanmartin:12345@cluster0.nfzl84s.mongodb.net/?retryWrites=true&w=majority";
        Scanner data = new Scanner(System.in);
        try(MongoClient mongoClient = MongoClients.create(uri)){
            MongoDatabase database = mongoClient.getDatabase("Airplanes");
            MongoCollection<Document> collection = database.getCollection("Airplanes");
            
            System.out.println("What ID you want to modify?");
            int search =data.nextInt();
            Document docmod =collection.find(eq("id", search)).first();
            System.out.println("Please insert new data:");
            System.out.print("id: ");
        int id = data.nextInt();
        System.out.print("PilotName: ");
        String pilotName=data.next();
        System.out.print("model:");
        String model = data.next();
        System.out.print("Amount:");
        int amount = data.nextInt();
        while (amount<=-1){
            System.out.println("No allowed");     
            System.out.print("Amount:");
            amount = data.nextInt();             
        }

        Document doc1 = new Document("id", id).append("PilotName", pilotName).append
        ("model", model).append("Amount", amount);
            UpdateResult result = collection.replaceOne(docmod, doc1);
            System.out.println("Matched document count: " + result.getMatchedCount());
            System.out.println("Modified document count: " + result.getModifiedCount());
        }
        
    }
    
    public static void showDatabase(){
        String uri ="mongodb+srv://jmsanmartin:12345@cluster0.nfzl84s.mongodb.net/?retryWrites=true&w=majority";
        Scanner data = new Scanner(System.in);
        try(MongoClient mongoClient = MongoClients.create(uri)){
            MongoDatabase database = mongoClient.getDatabase("Airplanes");
            MongoCollection<Document> collection = database.getCollection("Airplanes");
            
            MongoCursor<Document> cursor = collection.find().cursor();

            try {
                while (cursor.hasNext()){
                    System.out.println(cursor.next().toJson());
                }
            } finally {
                cursor.close();
            }
        }
    }     

}
