
package hw01formulatriangle;


import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Your Name <your.name at your.org>
 */
public class Hw01FormulaTriangle {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) throws IOException {
        FileWriter fileData = new FileWriter ( "D:\\Homework01\\hw01FormulaFileData.csv");
        fileData.write ("area,base,height");
        boolean salir = true;
        System.out.println("Calculate the area of ​​the triangle");
  
        System.out.println("area=(base*height)/2");
        while (salir == true){
            salir = menu(fileData);
        
    }
    
}
public static boolean menu(FileWriter fileData) throws IOException {
        boolean salir = true;
        Scanner readValue = new Scanner(System.in);
        System.out.println("MENU:\n"+"1. Date entry\n"+"3. Finished\n"+"Enter number: ");
        int opcion = readValue.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Put the base value: ");
                float base = readValue.nextFloat();
                System.out.println("Put the height value: ");
                float height = readValue.nextFloat();
                float area= calculateArea(base,height);
                saveData(area,base,height, fileData);
                break;
            case 3:
                salir = false;
                fileData.close();
                break;
            default:
                break;
}
      return salir;  
}
public static void saveData (float area, float base, float height, FileWriter fileData) throws IOException{
        fileData.write(area+","+base+","+height+"\n");
    }
    public static float calculateArea(float base, float height){
        float area =(base*height)/2;
        System.out.println((double)Math.round(area*100d)/100);
        System.out.println("triangle area");
        return area;
    }
    
}