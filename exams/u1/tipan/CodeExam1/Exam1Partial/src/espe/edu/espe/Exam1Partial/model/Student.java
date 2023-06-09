/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espe.edu.espe.Exam1Partial.model;

/**
 *
 * @author Oswaldo Tipan
 */
public class Student {
 
    private int id;
    private String name;
    private int age;
    
    public Student(){
    }
    
    public void setId(int id){
        this.id = id;
    }
   
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    
}
