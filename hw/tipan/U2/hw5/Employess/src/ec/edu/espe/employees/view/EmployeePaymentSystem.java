/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.employees.view;

import ec.edu.espe.employees.model.Employee;
import ec.edu.espe.tax.SalesTax;

/**
 *
 * @author Oswaldo Tipan
 */
public class EmployeePaymentSystem {
    
    public static void main(String[] arg){
   
        Employee employee;
        
        float monthlyPayment; 
        monthlyPayment = 2345.5F;
       
        float totalMonthlyPayment;
        totalMonthlyPayment = SalesTax.computeIncomeTax(monthlyPayment);
                
        System.out.println("Oswaldo Tipán Video Games");
        
        employee = new Employee(1, monthlyPayment,totalMonthlyPayment, "Oswaldo", "Manager");
       
        System.out.println("pair of shoes --> "+ employee);
    }
}
