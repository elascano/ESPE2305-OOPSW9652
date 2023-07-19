
package espe.edu.ec.model;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class NaturalUser {
    private int id;
    private String name;
    private String lastName;
    private float salary;
    private float tax;

    public float getTax() {
        return tax;
    }

    public void setTax(float tax) {
        this.tax = tax;
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
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    public NaturalUser(int id, String name, String lastName, float salary, float tax) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "NaturalUser{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", salary=" + salary + ", tax=" + tax + '}';
    }

   
    
}
