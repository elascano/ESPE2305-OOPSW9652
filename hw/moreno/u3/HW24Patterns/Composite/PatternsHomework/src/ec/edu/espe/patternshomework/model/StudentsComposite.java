/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.patternshomework.model;

import java.util.ArrayList;

/**
 * @author Moreno Paul,The encoders; DCCO-ESPE
 * @author Oswaldo Tipan
 */
public class StudentsComposite extends Student{
    
    private ArrayList<Student> homeSchool= new ArrayList<Student>();
    private String course; 

    public StudentsComposite(String course, String name, String age) {
        super(name, age);
        this.course = course;
    }

    public ArrayList<Student> getHomeSchool() {
        return homeSchool;
    }

    public String getCourse() {
        return course;
    }
    
    @Override
    public String toString() {
        return "course=" + course + "\n" + homeSchool;
    }
    
    public void add(Student student) {
        homeSchool.add(student);
        System.out.println(homeSchool);
    }
}
