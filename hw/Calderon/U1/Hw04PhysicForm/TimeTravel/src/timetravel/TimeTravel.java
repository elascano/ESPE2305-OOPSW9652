package timetravel;



import static adittionalities.ReaderFile.fileReader;
import static adittionalities.WriteFile.writeFile;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class TimeTravel {
        
    public static void main(String[] args){
        // TODO code application logic here
    
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;
    int option;

    while(!exit){
    System.out.println("----Wlcome to the menu---");
    System.out.println("1.- Calculate");
    System.out.println("2.- Data read ");
    System.out.println("3.- Exit");  
    
    System.out.println("Please choise the option: \n");
    try{
    option = scanner.nextInt();

    switch(option){
    
        case 1:
            System.out.println("1.- Calculate time ");
            writeFile();
            break;
        case 2:
            System.out.println("2.- Read Data");
            fileReader();
            break;
        case 3:
            exit = true;
            break;
        default :
            System.out.println("Invalid choise");
        }
      }catch(InputMismatchException e){
          System.out.println("Number");
          scanner.next();
      }
    }
    
    }
}

  

