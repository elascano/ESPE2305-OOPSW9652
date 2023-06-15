
package ec.edu.espe.techStore.model;
import java.io.Serializable;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */

public class CellphoneData implements Serializable {
    
    private int id;
    private String model;
    private String color;

    @Override
    public String toString() {
        return "\t\tCellPhone" + "\n\tid: " + id + "\n\tmodel: " + model + "\n\tcolor: " + color;
    }

    public CellphoneData(int id, String model, String color) {
        this.id = id;
        this.model = model;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
