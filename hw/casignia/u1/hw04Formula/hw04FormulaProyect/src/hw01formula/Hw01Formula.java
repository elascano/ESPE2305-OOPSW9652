package hw01formula;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Diego Casignia, Techwar, DCCO-ESPE
 */
public class Hw01Formula {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException{
        FileWriter fileData = new FileWriter("D:\\DIEGO\\Documents\\SOFTWARE\\POO\\HOMEWORK\\hw01FormulaFileData\\fileDataOhmLaw.csv");
        fileData.write("current,resistance,voltage\n");
        boolean finish = true;
        System.out.printf("---------- OHM LAW ----------\n");
	System.out.printf("Voltage = Current * Resistance\n");
	while(finish == true){
            finish = menu(fileData);
        }
    }
    
    public static boolean menu(FileWriter fileData) throws IOException{
        boolean finish = true;
        Scanner readValue = new Scanner(System.in);
        System.out.printf("MENU:\n"
                + "1. Enter data\n"
                + "2. Finish\n"
                + "Enter number: ");
        int numberMenu = readValue.nextInt();
        switch(numberMenu){
            case 1:
                System.out.printf("Enter the value of the current: ");
                float current = readValue.nextFloat();
                System.out.printf("Enter the resistance value: ");
                float resistance = readValue.nextFloat();
                float voltage = calculateVoltage(current, resistance);
                saveData(current, resistance, voltage, fileData);
                break;
            case 2:
                finish = false;
                fileData.close();
                break;
            default:
                break;
        }
	return finish;
    }
    
    public static void saveData(float current, float resistance, float voltage, FileWriter fileData) throws IOException{
        fileData.write(current+","+resistance+","+voltage+"\n");
    }
    
    public static float calculateVoltage(float current, float resistance){
	float voltage = current * resistance;
        System.out.printf("Voltage = %f [V] \n", voltage);
	return voltage;
    }
}
