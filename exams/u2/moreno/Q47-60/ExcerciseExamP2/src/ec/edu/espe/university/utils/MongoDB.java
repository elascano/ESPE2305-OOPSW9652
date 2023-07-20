
package ec.edu.espe.university.utils;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class MongoDB {
    
        
    public void connection(String collections, Document document){
        String uri = "mongodb+srv://pmoreno:pmoreno@cluster0.to6ri80.mongodb.net/?retryWrites=true&w=majority";
        String db = "ExamP2";
        try(MongoClient mongoClient = MongoClients.create(uri)){
            MongoDatabase database = mongoClient.getDatabase(db);
            MongoCollection<Document> collection = database.getCollection(collections);
            
            collection.insertOne(document);
            mongoClient.close();
        }
        
        
        
     
    }
   
}   
    

