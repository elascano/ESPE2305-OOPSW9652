/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.university.controller;

import ec.edu.espe.university.model.University;
import ec.edu.espe.university.utils.MongoDB;
import org.bson.Document;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class UniversityController {
    
    private int id;
    private String name;
    private int instructors;
    private int students;
    University uni = new University(id, name, students, instructors);
    public static void insert(University uni){
        
        
        Document document = new Document();
            document.append("id", uni.getId());
            document.append("name", uni.getName());
            document.append("numberOfStudents", uni.getNumberOfStudents());
            document.append("numberOfInstructors", uni.getNumberOfInstructors());
        
        MongoDB mongoDbConnection = new MongoDB();
        mongoDbConnection.connection("Universidad", document); 
}   
}
