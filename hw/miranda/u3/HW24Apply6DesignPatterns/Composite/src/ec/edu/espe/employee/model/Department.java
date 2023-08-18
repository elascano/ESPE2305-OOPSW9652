/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.employee.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class Department implements Employee{
    
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

   @Override
    public String showDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Department: ").append(name).append("\n");
        details.append("Employees:\n");
        for (Employee employee : employees) {
            details.append(employee.showDetails()).append("\n");
        }
        return details.toString();
    }
}
