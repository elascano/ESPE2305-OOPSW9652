/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.shoppper.controller;

import com.mongodb.client.MongoClient;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import java.util.Scanner;
import org.bson.Document;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class ShoppersReadPrint {
       public static void readDocument(){
        String uri ="mongodb+srv://jmsanmartin:12345@cluster0.nfzl84s.mongodb.net/?retryWrites=true&w=majority";
        Scanner data = new Scanner(System.in);
        try(MongoClient mongoClient = MongoClients.create(uri)){
            MongoDatabase database = mongoClient.getDatabase("Shoppers");
            MongoCollection<Document> collection = database.getCollection("Shoppers");
            
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
       public static void showDatabase(){
        String uri ="mongodb+srv://jmsanmartin:12345@cluster0.nfzl84s.mongodb.net/?retryWrites=true&w=majority";
        Scanner data = new Scanner(System.in);
        try(MongoClient mongoClient = MongoClients.create(uri)){
            MongoDatabase database = mongoClient.getDatabase("Shoppers");
            MongoCollection<Document> collection = database.getCollection("Shoppers");
            
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

