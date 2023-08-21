/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.patternshomework.model;

/**
 *
 * @author Oswaldo Tipan
 */
public abstract class Student {
    
    private String name;
    private String age;

    @Override
    public String toString() {
        return "name=" + name + ", age=" + age + '}';
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
