
package ec.edu.espe.Apartments.model;

/**
 *
 * @author Your Name <your.name at your.org>
 */
public class Hall {
    private String id;
    private String name;
    private String Category;
    private int stock;

    public Hall(String id, String name, String Category, int stock) {
        this.id = id;
        this.name = name;
        this.Category = Category;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Hall\n" + "Codigo=" + id + "\n Nombre=" + name + 
                "\n Categoria=" + Category + "\n stock=" + stock + '\n';
    }

    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
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
     * @return the Category
     */
    public String getCategory() {
        return Category;
    }

    /**
     * @param Category the Category to set
     */
    public void setCategory(String Category) {
        this.Category = Category;
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
