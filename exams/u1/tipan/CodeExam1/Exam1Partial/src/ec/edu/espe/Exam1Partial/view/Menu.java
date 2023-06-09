/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Exam1Partial.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import espe.edu.espe.Exam1Partial.model.Student;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Oswaldo Tipan
 */
public class Menu {
    
    ArrayList<Student> inputArray = new ArrayList();
    
    public void showMainMenu() throws IOException{
        
        int option = 0;
       
       while(option != 3){
           
           Scanner optionIn = new Scanner(System.in);
           
           System.out.println("1. Insert Data: ");
           System.out.println("2. Delete data: ");
           System.out.println("3. Exit");
           System.out.println("Insert you choosen option: ");
           option = optionIn.nextInt();
           
           switch(option){
                case 1:
                    showInsertMenu();
                   break;
                case 2:
                    deleteData(inputArray);
                    break;
                case 3:
                    option=3;
                    break;
                default:
                    System.out.println("Insert a valid option");
                    break;
           }
       }
    }
    
    public void showInsertMenu(){
        
        Scanner dataIn =new Scanner(System.in);
        
        Student input = new Student();
        
        System.out.println("Insert id: ");
        input.setId(dataIn.nextInt());
        System.out.println("Insert Name: ");
        input.setName(dataIn.next());
        System.out.println("Insert Age: ");
        input.setAge(dataIn.nextInt());

        inputArray.add(input);
        
        saveData(inputArray);
    }
    
    public void saveData(ArrayList input){
        
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String dataSaver = gson.toJson(input);
        
        try(FileWriter writer2 = new FileWriter("data\\students.json", false)) {
            writer2.write(dataSaver);
        } catch (IOException e) {
            System.out.println("Error generating JSON file: " + e.getMessage());
        }
    }
    
    public void deleteData(ArrayList input) throws IOException{
        input.clear();
        saveData(input);

        try(FileWriter writer = new FileWriter("data\\students.json", false)){
            writer.write("");
        }catch(IOException e){
            System.out.println("Error generating JSON file: " + e.getMessage());
        }
    }
}
