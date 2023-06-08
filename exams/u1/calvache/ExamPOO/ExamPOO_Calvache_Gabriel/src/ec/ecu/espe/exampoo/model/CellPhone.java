
package ec.ecu.espe.exampoo.model;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class CellPhone {
    private String model;
    private String color;
    private String size;

    @Override
    public String toString() {
        return "CellPhone List" + "\nModel=" + getModel() + "\nColor=" + getColor() + "\nSize=" + getSize() + "\n";
    }

    
    public CellPhone(String model, String color, String size) {
        this.model = model;
        this.color = color;
        this.size = size;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
}
