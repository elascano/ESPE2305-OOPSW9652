package ec.edu.espe.techStore.view;

import ec.edu.espe.techStore.model.CellphoneData;
import ec.edu.espe.techStore.utils.FileManager;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Team 1, Techware, DCCO-ESPE
 */
public class Menu {

    private List<CellphoneData> cellphoneDataList;

    public Menu() {
        cellphoneDataList = new ArrayList<>();
    }

    public void showMenu() throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean continueMenu = true;

        System.out.println("\n\t\t------ TechStore ------");
        System.out.println("\n\t\t\t--- System by Team 1 ---");

        while (continueMenu) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Cellphone");
            System.out.println("2. Show Cellphone");
            System.out.println("3. Exit");
            System.out.print("\n\tChoose one option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addCellphone();
                    break;
                case 2:
                    showCellphones();
                    break;
                case 3:
                    System.out.println("\nThanks for using the system.\n\n");
                    continueMenu = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private void addCellphone() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the cellphone ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter the cellphone model: ");
        scanner.nextLine(); // Consume the new line character
        String model = scanner.nextLine();

        System.out.print("Enter the cellphone color: ");
        String color = scanner.nextLine();

        CellphoneData cellphoneData = new CellphoneData(id, model, color);
        cellphoneDataList.add(cellphoneData);

        System.out.println("Cellphone added successfully.");
    }

    private void showCellphones() {
        if (cellphoneDataList.isEmpty()) {
            System.out.println("No cellphone data available.");
        } else {
            System.out.println("Cellphone data:");
            for (CellphoneData cellphoneData : cellphoneDataList) {
                System.out.println(cellphoneData);
            }
        }
    }

    private void saveCellphoneData() {
        FileManager.SaveAndReadObject(cellphoneDataList);
    }

   private void loadCellphoneData() {
        cellphoneDataList = FileManager.loadCellphoneData();
        System.out.println("Cellphone data loaded successfully.");
    }

    
}

