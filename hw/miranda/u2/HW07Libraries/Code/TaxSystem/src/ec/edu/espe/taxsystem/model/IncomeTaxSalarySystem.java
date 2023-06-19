package ec.edu.espe.taxsystem.model;

import java.util.Scanner;
import static com.bugbusters.tax.SalesTax.computeIncomeTax;
/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class IncomeTaxSalarySystem {
    int id;
    float monthlySalary;
    float incomeTax;
    float totalSalary;
    float monthlyTotalSalary;
    
    public static float getSalary(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your monthly salary: ");
        float monthlySalary = scanner.nextFloat();
        return monthlySalary;
    }
    
    public static void printIncomeTax(){
        float monthlySalary = IncomeTaxSalarySystem.getSalary();
        float incomeTax = computeIncomeTax(monthlySalary);
        float totalSalary = ((monthlySalary * 12) - incomeTax);
        float monthlyTotalSalary = (totalSalary / 12);

        IncomeTaxSalarySystem incomeTaxSalary = new IncomeTaxSalarySystem(1, monthlySalary, incomeTax, totalSalary, monthlyTotalSalary);
        System.out.println("Income Tax ---> " + incomeTaxSalary.toString());
    }    

    public IncomeTaxSalarySystem(int id, float monthlySalary, float incomeTax, float totalSalary, float monthlyTotalSalary) {
        this.id = id;
        this.monthlySalary = monthlySalary;
        this.incomeTax = incomeTax;
        this.totalSalary = totalSalary;
        this.monthlyTotalSalary = monthlyTotalSalary;
    }

   

    @Override
    public String toString() {
        return "-- IncomeTaxSalary{" + 
                "\n id=" + id + 
                "\n monthlySalary=" + monthlySalary + 
                "\n incomeTax=" + incomeTax + 
                "\n totalSalary=" + totalSalary + 
                "\n monthlyTotalSalary=" + monthlyTotalSalary + '}';
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(float monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public float getIncomeTax() {
        return incomeTax;
    }

    public void setIncomeTax(float incomeTax) {
        this.incomeTax = incomeTax;
    }

    public float getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(float totalSalary) {
        this.totalSalary = totalSalary;
    }

    public float getMonthlyTotalSalary() {
        return monthlyTotalSalary;
    }

    public void setMonthlyTotalSalary(float monthlyTotalSalary) {
        this.monthlyTotalSalary = monthlyTotalSalary;
    }

   
    
}
