package ec.edu.espe.vehicle.model;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class Vehicle {
    private int id;
    private String name;
    private String model;
    
    public Vehicle(){
        name = "";
        model = "";        
    }
    
    public Vehicle(int id, String name, String model){
        this.id = id;
        this.name = name;
        this.model = model;
    }
     @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", name=" + name + ", model=" + model + '}';
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }
    
}
