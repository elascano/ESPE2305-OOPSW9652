package ec.edu.espe.icecalculatorsystem.view;

import ec.edu.espe.icecalculatorsystem.model.AlcoholImport;
import ec.edu.espe.icecalculatorsystem.model.PlasticBag;
import java.util.Scanner;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class IceCalculatorSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float price = 0;
        int option;
        boolean loop = true;

        AlcoholImport alcoholImport;
        PlasticBag plasticBag;
        while (loop) {
            System.out.println("----Gabriel Calvache Store----");
            System.out.println("Please Select an Option");
            System.out.println("1.Import Alcohol Price");
            System.out.println("2.Plastic Bag Price");
            System.out.println("3.Exit");
            System.out.println("Selected Option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Please insert the price of the Alcohol:");
                    price= scanner.nextFloat();
                    alcoholImport = new AlcoholImport(price);
                    System.out.println(alcoholImport);
                    break;
                case 2:
                    System.out.println("Please insert the price of the Plastic Bag:");
                    price= scanner.nextFloat();                    
                    plasticBag = new PlasticBag(price);
                    System.out.println("The price of the product is==> "+plasticBag);
                    break;
                case 3:
                    System.out.println("See you later");
                    loop=false;
                    break;
                default:
                    System.out.println("That is not a correct option");

            }
        }
    }
}
