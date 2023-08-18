
package ec.edu.espe.finalexam.utils;

import com.mongodb.client.MongoCollection;
import static ec.edu.espe.finalexam.utils.MongoConnection.getConnection;
import org.bson.Document;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class Operation {
       public static void addSortMethod(Document sortMethod) {
        MongoCollection collection = getConnection("arrayGabriel");
        collection.insertOne(sortMethod);
    }
}
