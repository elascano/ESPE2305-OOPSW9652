package ec.edu.espe.menu;


import static ec.edu.espe.file.FileCsv.createfile;
import static ec.edu.espe.file.ReadTheSaved.readFile;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author micha
 */
public class MenuKineticEnergy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        boolean exit = false;

        while (!exit) {

            System.out.println("--Welcome--");
            System.out.println("1. Calculate Kinetic Energy");
            System.out.println("2. Read Data");
            System.out.println("3. Exit");

            System.out.println("Choose an Option");
           
            try{
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Calculate kinetic Energy");
                    createfile();
                    
                    break;
                case 2:
                    readFile();
                    break;
                case 3:
                    exit = true;
                    break;
            }
            }catch(InputMismatchException e){
                System.out.println("Error");
                scanner.next();
            }
                
                
            }
        }
    }
