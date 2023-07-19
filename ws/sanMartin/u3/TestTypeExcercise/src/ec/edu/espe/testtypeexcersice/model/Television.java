
package ec.edu.espe.testtypeexcersice.model;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class Television {
    private int id;
    private String model;
    private int toSell;
    private int stock;

    public Television(int id, String model, int toSell, int stock) {
        this.id = id;
        this.model = model;
        this.toSell = toSell;
        this.stock = stock;
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

    /**
     * @return the toSell
     */
    public int getToSell() {
        return toSell;
    }

    /**
     * @param toSell the toSell to set
     */
    public void setToSell(int toSell) {
        this.toSell = toSell;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
}
