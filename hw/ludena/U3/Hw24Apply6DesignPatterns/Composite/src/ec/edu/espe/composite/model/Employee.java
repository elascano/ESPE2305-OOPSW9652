
package ec.edu.espe.composite.model;

/**
 *
 * @author LENOVO
 */
public abstract class Employee {
    private String name;
    private String title;

    public Employee(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
    
    public void stateName(){
        String data = title + " " + name;
    }
    
}
