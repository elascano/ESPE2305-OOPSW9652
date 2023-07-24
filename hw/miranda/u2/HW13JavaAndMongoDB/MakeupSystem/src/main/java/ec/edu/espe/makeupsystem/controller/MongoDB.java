package ec.edu.espe.makeupsystem.controller;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDB {
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    
    public MongoDB() {
        String connectionString = "mongodb+srv://mirandaalison:mirandaalison@cluster0.d67n2we.mongodb.net/?retryWrites=true&w=majority";
        MongoClientURI uri = new MongoClientURI(connectionString);
        mongoClient = new MongoClient(uri);
        database = mongoClient.getDatabase("Makeup");
        collection = database.getCollection("MakeupProduct");
    }
    
    public void insertProduct(MakeupProduct product) {
        Document document = new Document()
                .append("product", product.getProduct())
                .append("id", product.getId())
                .append("color", product.getColor())
                .append("price", product.getPrice());
        collection.insertOne(document);
    }
    
    public void updateProduct(int productId, MakeupProduct updatedProduct) {
        Document filter = new Document("id", productId);
        Document update = new Document()
                .append("$set", new Document()
                        .append("product", updatedProduct.getProduct())
                        .append("color", updatedProduct.getColor())
                        .append("price", updatedProduct.getPrice()));
        collection.updateOne(filter, update);
    }
    
    public void deleteProduct(int productId) {
        Document filter = new Document("id", productId);
        collection.deleteOne(filter);
    }
    
    public void getAllProducts() {
        for (Document document : collection.find()) {
            String product = document.getString("product");
            int id = document.getInteger("id");
            String color = document.getString("color");
            float price = document.getFloat("price");
            MakeupProduct makeupProduct = new MakeupProduct(product, id, color, price);
            System.out.println(makeupProduct);
        }
    }
    
    public void closeConnection() {
        mongoClient.close();
    }
}
