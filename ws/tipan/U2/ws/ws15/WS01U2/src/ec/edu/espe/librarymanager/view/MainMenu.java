/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.librarymanager.view;

import ec.edu.espe.librarymanager.utils.FileManager;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Oswaldo Tipan
 */
public class MainMenu {
    
    public static void main(String[] arg) throws IOException{
        
        int option = 0;
        Scanner optionInserted = new Scanner(System.in);
        
        while(option != 3){
            System.out.println("-------Library Manager--------");
            System.out.println("1. Insert a new book\n");
            System.out.println("2. Show all books\n");
            System.out.println("3. Exit");
            System.out.println("Insert your choosen option: ");
            
            option = controlSelectedOption(optionInserted.nextInt());
        }
    }
    
    public static int controlSelectedOption(int option) throws IOException{
        
        int optionForReturn = 0;
        
        switch(option){
            case 1:
                FileManager.askForData();
                break;
            case 2:
                FileManager.showAllBooks();
                break;
            case 3:
                optionForReturn = 3;
                break;
            default:
                break;
        }
        return optionForReturn;
    }
}

