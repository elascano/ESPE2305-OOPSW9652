/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.employees.model;

/**
 *
 * @author Oswaldo Tipan
 */
public class Employee {
    
    int id;
    float monthlyPayment;
    float totalMonthlyPayment;
    String name;
    String position;

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", monthlyPayment=" + monthlyPayment + ", totalMonthlyPayment=" + totalMonthlyPayment + ", name=" + name + ", position=" + position + '}';
    }

    public Employee(int id, float monthlyPayment, float totalMonthlyPayment, String name, String position) {
        this.id = id;
        this.monthlyPayment = monthlyPayment;
        this.totalMonthlyPayment = totalMonthlyPayment;
        this.name = name;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public float getMonthlyPayment() {
        return monthlyPayment;
    }

    public float getTotalMonthlyPayment() {
        return totalMonthlyPayment;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

   
}
    
