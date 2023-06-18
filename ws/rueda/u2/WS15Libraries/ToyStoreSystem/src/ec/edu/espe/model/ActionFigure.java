
package ec.edu.espe.model;
import java.io.Serializable;
/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class ActionFigure implements Serializable{
    
    private static final long serialversionUID = 1L;
    
    private int id;
    private String character;
    private int height;
    private int weight;

    public ActionFigure(int id, String character, int height, int weight) {
        this.id = id;
        this.character = character;
        this.height = height;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ActionFigure{" + "id=" + id + ", character=" + character + ", height=" + height + ", weight=" + weight + '}';
    }
    
    
}
