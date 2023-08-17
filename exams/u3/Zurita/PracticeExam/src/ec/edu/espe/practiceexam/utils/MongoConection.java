/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.practiceexam.utils;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Oswaldo Tipan
 */
public class MongoConection { 
    public static <T> void addData(String collections, String uri, String db, T object){
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase database = mongoClient.getDatabase(db);
        MongoCollection<Document> collection = database.getCollection(collections);
        try{
            Document data = Document.parse(object.toString());
            collection.insertOne(data);
        } catch (MongoException me) {
            System.out.println("No se pudo por: " + me);
        }
    }
    
    public static <T> void addDataDoc(String collections, String uri, String db, Document data){
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase database = mongoClient.getDatabase(db);
        MongoCollection<Document> collection = database.getCollection(collections);
        try{
            collection.insertOne(data);
        } catch (MongoException me) {
            System.out.println("No se pudo por: " + me);
        }
    }  
    
    public static <T> void deleteData(String collections, String uri, String db, int id){
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase database = mongoClient.getDatabase(db);
        MongoCollection<Document> collection = database.getCollection(collections);
        try{
            Document findDocument = new Document ("id",id);
            collection.findOneAndDelete(findDocument);
        } catch (MongoException me) {
            System.out.println("No se pudo por: " + me);
        }
    }
    
    public static <T> void updateData(String collections, String uri, String db, int id, T object){
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase database = mongoClient.getDatabase(db);
        MongoCollection<Document> collection = database.getCollection(collections);
        try{
            Document findDocument = new Document ("id",id);
            Document data = Document.parse(object.toString());
            collection.findOneAndReplace(findDocument, data);
        } catch (MongoException me) {
            System.out.println("No se pudo por: " + me);
        }
    } 
    
    public static <T> Document getData(String collections, String uri, String db, int id){
        MongoClient mongoClient = MongoClients.create(uri);
        MongoDatabase database = mongoClient.getDatabase(db);
        MongoCollection<Document> collection = database.getCollection(collections);
        MongoCursor<Document> cursor = null;
        Document data = null;
        try{
            Document findDocument = new Document ("id", id);
            cursor = collection.find(findDocument).iterator();
            while(cursor.hasNext()){
                data = cursor.next();
            }
        } catch (MongoException me) {
            System.out.println("No se pudo por: " + me);
        }
        return data;
    }
}
