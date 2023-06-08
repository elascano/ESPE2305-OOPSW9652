package ec.ecu.espe.exampoo.model;

import ec.ecu.espe.exampoo.controller.ManageJson;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class ModifyCellPhone {

    public void readCellPhone() throws FileNotFoundException {
        ManageJson manageJson = new ManageJson();
        File archivo = new File("data\\cellphone.json");
        ArrayList<CellPhone> listCellPhone = new ArrayList<>();
        System.out.println("\t\t\t\tCell Phone List");

        if (archivo.exists() && archivo.length() == 0) {
            System.out.println("There are no cell phones\n\n");
        } else {
            listCellPhone = manageJson.readJson();
            for (CellPhone cellPhone : listCellPhone) {
                System.out.println(cellPhone.toString());
            }
        }
    }

    public void createCellPhone() throws FileNotFoundException {
        ManageJson manageJson = new ManageJson();
        ArrayList<CellPhone> listCellPhone = new ArrayList();
        CellPhone cellPhone;
        Scanner readData = new Scanner(System.in);

        String model;
        String color;
        String size;

        System.out.println("Cell Phone Model: ");
        model = readData.nextLine();
        System.out.println("Cell Phone Color: ");
        color = readData.nextLine();
        System.out.println("Cell Phone Size: ");
        size = readData.nextLine();

        cellPhone = new CellPhone(model, color, size);

        File archivo = new File("data\\cellphone.json");
        if (archivo.exists() && archivo.length() == 0) {
            listCellPhone = new ArrayList<>();
        } else {
            listCellPhone = ManageJson.readJson();
        }

        listCellPhone.add(cellPhone);
        ManageJson.writteJson(listCellPhone);
    }

    public void deleteCellPhone() throws FileNotFoundException {
        ManageJson manageJson = new ManageJson();
        File archivo = new File("data\\cellphone.json");
        ArrayList<CellPhone> listCellPhone = new ArrayList();

        if (archivo.exists() && archivo.length() == 0) {
            System.out.println("There are no cell phones \n\n");
        } else {
            listCellPhone = manageJson.readJson();
            Scanner readData = new Scanner(System.in);

            listCellPhone.removeAll(listCellPhone);
            ManageJson.writteJson(listCellPhone);
            System.out.println("All cell phone list delete");

        }
    }
}
