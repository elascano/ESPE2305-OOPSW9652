/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.codepartexam.model;

/**
 *
 * @author Oswaldo Tipan
 */
public class Student {
    
    private int id;
    private int course;
    private String name;
    private String monthylPayment;

    public Student(int id, int course, String name, String monthylPayment) {
        this.id = id;
        this.course = course;
        this.name = name;
        this.monthylPayment = monthylPayment;
    }

    public int getId() {
        return id;
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public String getMonthylPayment() {
        return monthylPayment;
    }   
}
