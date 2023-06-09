
package ec.edu.espe.exam1.controller;

import ec.edu.espe.exam1.model.Topic;
import java.util.ArrayList;


/**
 *
 * @author juan rueda
 */
public class EliminateTopics {
    ArrayList <topic> topics = new ArrayList<>;
    

        public void agregateObject(Topic topics) {
            topics.add(topics);
        }

        public void eliminateObjects(String object1, String object2) {
            topics.removeIf(topics -> topics.getString("object").equals(object1)
                    && topic.getString("Object2").equals(Object2));
        }
} 
