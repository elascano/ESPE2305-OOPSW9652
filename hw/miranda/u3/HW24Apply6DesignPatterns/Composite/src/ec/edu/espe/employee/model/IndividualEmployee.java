/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.employee.model;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class IndividualEmployee implements Employee{
    
    private String name;
    private String position;

    public IndividualEmployee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String showDetails() {
        return "Employee: " + name + ", Position: " + position;
    }
}
