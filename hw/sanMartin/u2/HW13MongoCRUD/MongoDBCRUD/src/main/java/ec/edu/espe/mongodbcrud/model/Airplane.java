
package ec.edu.espe.mongodbcrud.model;

import java.util.ArrayList;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class Airplane {
    private int id;
    private String pilotName;
    private String model;
    private ArrayList<Integer> amount;
    
    public Airplane(){
        id = 0;
        pilotName = "";
        model = "";
        amount = new ArrayList<>();  }

    public Airplane(int id, String pilotName, String model, ArrayList<Integer> amount) {
        this.id = id;
        this.pilotName = pilotName;
        this.model = model;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return pilotName;
    }

    public void setName(String pilotName) {
        this.pilotName = pilotName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public ArrayList<Integer> getAmount() {
        return amount;
    }

    public void setAmount(ArrayList<Integer> amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Airplane{" + "id=" + id + ", name=" + pilotName + ", model=" + model + ", amount=" + amount + '}';
    }
    
}
