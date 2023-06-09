
package ec.edu.espe.exam1.model;

import java.util.ArrayList;

/**
 *
 * @author juan rueda, The encoders; DCCO-ESPE
 */
public class Topic {
    private int id;
    private ArrayList<Topic>topics;

    @Override
    public String toString() {
        return "Topic{" + "id=" + id + ", topics=" + topics + '}';
    }
    

    public Topic(int id, ArrayList<Topic> topics) {
        this.id = id;
        this.topics = topics;
    }
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the topics
     */
    public ArrayList<Topic> getTopics() {
        return topics;
    }

    /**
     * @param topics the topics to set
     */
    public void setTopics(ArrayList<Topic> topics) {
        this.topics = topics;
    }
    
    
}
