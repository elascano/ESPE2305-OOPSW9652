
package ec.edu.espe.perfume.view;

import com.bugbusters.tax.SalesTax;
import ec.edu.espe.perfume.model.Employee;
import ec.edu.espe.perfume.model.Perfume;

/**
 *
 * @author LENOVO
 */
public class PerfumeSales {
    public static void main(String[] args) {
    Perfume perfume;
    Employee employee;
    float price;
    float ivaPercentage;
    float icePercentage;
    double salary;
    
    price = 30.0F;
    ivaPercentage = 12.0F;
    icePercentage = 20.0F;
    salary = 3600.0;
    
    
    float totalPrice;
    float totalPrice2;
    double totalSalary;
    
    System.out.println("---------- Welcome to Perfume Store ----------");
    totalPrice = SalesTax.computeIva(price, ivaPercentage);
    perfume = new Perfume("Encounter","Calvin Clain","123124321",price,totalPrice);
    System.out.println("Perfume IVA: " + perfume);
    System.out.println("");
    
    totalPrice2 = SalesTax.computeIce(price, icePercentage);
    perfume = new Perfume("Black","CAROLINA HERRERA","276351276",price,totalPrice2);
    System.out.println("Perfume ICE : " + perfume);
    System.out.println("");
    
    totalSalary = SalesTax.computeIR(salary);
    employee = new Employee("Edison","1742582953",19,salary,totalSalary);
    System.out.println("Employee salary : " + employee);
    System.out.println("");
    
    }
}
