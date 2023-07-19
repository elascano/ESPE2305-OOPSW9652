
package espe.edu.ec.controller;
import java.util.Scanner;
import com.operartiongosling.taxes.IncomeTax;
import espe.edu.ec.model.NaturalUser;
/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class computingData {
    Scanner data = new Scanner(System.in);
    
    public void compute(){
        System.out.println("Add an ID: ");
        int id = data.nextInt();
        System.out.println("Add Name: ");
        String name = data.next();
        System.out.println("Add Last Name: ");
        String lastName=data.next();
        System.out.println("Add Monthly Salary: ");
        float salary = data.nextFloat(); 
        float tax = taxCalculate(salary);
        NaturalUser natural = new NaturalUser(id, name, lastName, salary, tax);
        System.out.println("Info : " + natural);
    }
    
    public static float taxCalculate(float salary){
        float taxes = 0.0f;
        float tax = 0.0f;
        if(salary>=0 && salary <11722){
        taxes =IncomeTax.compute(salary, 0, 0, 11722);
        
        }else if (salary>=11722 && salary <14935){
        taxes =IncomeTax.compute(salary, 5, 11722, 14935);
           
        }
        else if (salary>=14935 && salary <=18667){
        taxes =IncomeTax.compute(salary, 10, 14935, 18666);
           
        }
        else if (salary>=18667 && salary <=22418){
        taxes =IncomeTax.compute(salary, 12, 11866, 22418);           
        }
        else if (salary>=22418 && salary <=32783){
        taxes =IncomeTax.compute(salary, 15, 0, 11722);           
        }
        else if (salary>=32783 && salary <=43147){
        taxes =IncomeTax.compute(salary, 20, 32783,43147);           
        }
        else if (salary>=43147 && salary <=53512){
        taxes =IncomeTax.compute(salary, 25, 43147, 53512);           
        }
        else if (salary>=53512 && salary <=63876){
        taxes =IncomeTax.compute(salary, 30, 53512, 63873);           
        }
        else if (salary>=63876 && salary <=103644){
        taxes =IncomeTax.compute(salary, 35, 63876, 103644);           
        }
        else if (salary>=103644){
        taxes =IncomeTax.compute(salary, 37, 0, salary);           
        }
        tax = taxes;
        return tax;    }
    
}
