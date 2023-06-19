
package ec.edu.espe.showtax.model;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class ShowIncomeTax {
    
    private float salary;
    private float totalSalary;

    public ShowIncomeTax(float salary, float totalSalary) {
        this.salary = salary;
        this.totalSalary = totalSalary;
    }

    @Override
    public String toString() {
        return "Income Tax:" + "\n salary: " + salary + "\n total Salary: " + totalSalary ;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(float totalSalary) {
        this.totalSalary = totalSalary;
    }
    
}
