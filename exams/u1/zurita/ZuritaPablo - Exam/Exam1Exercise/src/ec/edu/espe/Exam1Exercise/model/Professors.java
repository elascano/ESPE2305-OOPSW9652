/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Exam1Exercise.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pablo Zurita
 */


public class Professors {
    public static ArrayList<String> dataOfProfessors = new ArrayList<>();
    
    public static void main(String[] args) {
        
        int id;
        String name;
        String email;
        int alfabeticNumber;
        
        System.out.println(dataOfProfessors);
        System.out.println("Hola");
           
        
        
    }
    
    @Override
    public String toString() {
        String email = "ejemplo123@example.com";
        String id = "1";
        String name = "Juan";
        String alfabeticNumber = "23";
        return "Professors{" + "id=" + id + ", name=" + name + ", email=" + email + ", alfabeticNumber=" + alfabeticNumber + '}';
    }
   

    
    
    
    
    private static void showAttributes() {
        
        if (dataOfProfessors.isEmpty()) {
            System.out.println("No hay datos registrados");
        } else {
            System.out.println("Datos Ingresados:");

            for (int i = 0; i < dataOfProfessors.size(); i++) {
                
                System.out.println(i+1 + ": " + dataOfProfessors.get(i)+ " - " );
            }
        }
    }
}
