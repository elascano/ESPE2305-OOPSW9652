
package ec.ecu.espe.strategy.utils;

import com.mongodb.client.MongoCollection;
import static ec.ecu.espe.strategy.utils.MongoDB.getConnection;
import org.bson.Document;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class Operation {
    public static void addSortMethod(Document sortMethod) {
        MongoCollection collection = getConnection("arrayPaul");
        collection.insertOne(sortMethod);
    }
}
