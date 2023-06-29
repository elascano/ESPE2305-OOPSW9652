/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsystem.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.InsertOneResult;
import ec.edu.espe.farmsystem.model.Book;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.bson.Document;

/**
 *
 * @author PabloEZurita
 */
public class BookController {
    private static String uri = "mongodb+srv://pzurita:pzurita@cluster0.ohfzkul.mongodb.net/?retryWrites=true&w=majority";
    
    public static ArrayList<Book> listOfBooks = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    public static void addBook(){
        System.out.println("Enter the data of Book:");
        System.out.println("Id: ");
        int id = checkEnteredData();
        System.out.println("Title: ");
        String title = scanner.next();
        System.out.println("Author: ");
        String author = scanner.next();
        System.out.println("Date of publication");
        String dateOfPublication = scanner.next();
        Book book = new Book(id, title, author, dateOfPublication);
        listOfBooks.add(book);
        
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("Farm");
            MongoCollection<Document> collection = database.getCollection("Books");
            try {
                InsertOneResult result = collection.insertOne(new Document()
                        .append("_id", id)
                        .append("title", title)
                        .append("author", author)
                        .append("date of publication", dateOfPublication));
                System.out.println("Success! Inserted document id: " + result.getInsertedId());
            } catch (MongoException me) {
                System.err.println("Unable to insert due to an error: " + me);
            }
        }
    }
    
    public static void updateBook(){
        System.out.println("Insert the id: ");
        int id = scanner.nextInt();
        
        System.out.println("Insert the campus to change: ");
        String change = scanner.next();
        
        System.out.println("Insert the new value: ");
        String newValue = scanner.next();
        
        try (MongoClient mongo = MongoClients.create(uri)) {
            MongoDatabase database = mongo.getDatabase("Farm");
            MongoCollection<Document> collection = database.getCollection("Books");
            
            BasicDBObject searchQuery = new BasicDBObject();
            searchQuery.put("_id",id);
            MongoCursor<Document> cursor = collection.find(searchQuery).iterator();
            String oldValue = (String) cursor.next().get(change);
            
            collection.updateOne(Filters.eq(change,oldValue), Updates.set(change, newValue));
      
            System.out.println("Book updated");
        }catch(MongoException me){
            System.out.println("Problem to eliminate for: "+me);
        }
    }
    
    public static void showBook(){
        
        try (MongoClient mongo = MongoClients.create(uri)) {
            MongoDatabase database = mongo.getDatabase("Farm");
            MongoCollection<Document> collection = database.getCollection("Books");
            MongoCursor<Document> cursor = collection.find().iterator();
            
            System.out.println("--------- Saved Data ---------");
            System.out.println("Id\t\tTitle\t\tAuthor\t\tYear of Publication");
            while (cursor.hasNext()) {
                System.out.println(cursor.next().toJson());
            }
        }catch(MongoException me){
            System.out.println(me);
        }
    }
    
    public static void deletBook(){
        System.out.println("Insert the id: ");
        int id = scanner.nextInt();
        
        try (MongoClient mongo = MongoClients.create(uri)) {
            MongoDatabase database = mongo.getDatabase("Farm");
            MongoCollection<Document> collection = database.getCollection("Books");
            
            Document findDocument = new Document ("_id",id);
            collection.findOneAndDelete(findDocument);
      
            System.out.println("Book deleted");
        }catch(MongoException me){
            System.out.println("Problem to eliminate for: "+me);
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
