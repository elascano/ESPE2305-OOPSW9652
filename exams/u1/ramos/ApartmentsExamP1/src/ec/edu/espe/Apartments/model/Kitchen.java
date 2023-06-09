
package ec.edu.espe.Apartments.model;

import java.util.ArrayList;

/**
 *
 * @author Your Name <your.name at your.org>
 */
public class Kitchen {
    private int Id;
    private ArrayList<Hall> halls;

    @Override
    public String toString() {
        return "Apartmnts\n" + "Numero=" + Id + "\nproductos=" + halls + '\n';
    }

    
    
    public Kitchen(int Id, ArrayList<Hall> halls) {
        this.Id = Id;
        this.halls = halls;
    }

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the products
     */
    public ArrayList<Hall> getHalls() {
        return halls;
    }

    /**
     * @param halls the products to set
     */
    public void setProducts(ArrayList<Hall> halls) {
        this.halls = halls;
    }
    
}
