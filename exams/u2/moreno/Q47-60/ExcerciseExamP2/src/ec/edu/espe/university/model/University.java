/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.university.model;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class University {
    private int id;
    private String name;
    private int numberOfStudents;
    private int numberOfInstructors;

    public University(int id, String name, int numberOfStudents, int numberOfInstructors) {
        this.id = id;
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.numberOfInstructors = numberOfInstructors;
    }

    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the numberOfStudents
     */
    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    /**
     * @param numberOfStudents the numberOfStudents to set
     */
    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    /**
     * @return the numberOfInstructors
     */
    public int getNumberOfInstructors() {
        return numberOfInstructors;
    }

    /**
     * @param numberOfInstructors the numberOfInstructors to set
     */
    public void setNumberOfInstructors(int numberOfInstructors) {
        this.numberOfInstructors = numberOfInstructors;
    }
            
}
