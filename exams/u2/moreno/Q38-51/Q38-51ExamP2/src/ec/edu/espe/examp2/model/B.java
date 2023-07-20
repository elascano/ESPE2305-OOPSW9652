
package ec.edu.espe.examp2.model;

/**
 *
 * @author Paul Moreno, Bug Busters, DCCO-ESPE
 */
public class B extends A{
    private String Name;
    private String  type;

    public B(String Name, String type, int id) {
        super(id);
        this.Name = Name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "B{" +super.toString()+ "Name=" + Name + ", type=" + type + '}';
    }
    
    

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    
}
