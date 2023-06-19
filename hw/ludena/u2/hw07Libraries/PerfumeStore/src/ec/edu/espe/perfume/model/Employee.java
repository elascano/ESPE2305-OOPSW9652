
package ec.edu.espe.perfume.model;

/**
 *
 * @author LENOVO
 */
public class Employee {
    private String name;
    private String id;
    private int age;
    private double salary;
    private double totalSalary;

    public Employee(String name, String id, int edad, double salary, double totalSalary) {
        this.name = name;
        this.id = id;
        this.age = edad;
        this.salary = salary;
        this.totalSalary = totalSalary;
    }

    @Override
    public String toString() {
        return "\n name=" + name + "\n id=" + id + "\n age=" + age + "\n salary=" 
                + salary + "\n IR=" + totalSalary;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(float totalSalary) {
        this.totalSalary = totalSalary;
    }
    
    
    
    
}
