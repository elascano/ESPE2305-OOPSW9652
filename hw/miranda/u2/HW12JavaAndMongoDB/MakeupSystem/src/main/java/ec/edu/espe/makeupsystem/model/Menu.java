package ec.edu.espe.makeupsystem.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class Menu {
    private static List<MakeupProduct> products = new ArrayList<>();
    int option;
    public static void showMenu() {
        int option;
        do {
            System.out.println("=== Alison Miranda's Makeup System ===");
            System.out.println("1. Add product");
            System.out.println("2. Edit product");
            System.out.println("3. Show products");
            System.out.println("4. Delete product");
            System.out.println("5. Exit");
            System.out.print("Enter an option: ");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    editProduct();
                    break;
                case 3:
                    showProducts();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    System.out.println("Exited program");
                    break;
                default:
                    System.out.println("Invalid option, enter again.");
                    break;
            } 
        } while (option != 5);
    }
    
    private static void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Add Product ===");
        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter product ID: ");
        int productId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter product color: ");
        String productColor = scanner.nextLine();
        System.out.print("Enter product price: ");
        float productPrice = scanner.nextFloat();
        MakeupProduct product = new MakeupProduct(productName, productId, productColor, productPrice);
        products.add(product); 
        System.out.println("Product added successfully!");
    }

    private static void editProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Edit Product ===");
        System.out.print("Enter product ID to edit: ");
        int productId = scanner.nextInt();
        MakeupProduct productToEdit = null;
        for (MakeupProduct product : products) {
            if (product.getId() == productId) {
                productToEdit = product;
                break;
            }
        }
        if (productToEdit != null) {
            System.out.println("Product found:");
            System.out.println(productToEdit);
            System.out.println("Enter new product details:");
            scanner.nextLine();
            System.out.print("Enter new product name: ");
            String newProductName = scanner.nextLine();
            System.out.print("Enter new product color: ");
            String newProductColor = scanner.nextLine();
            System.out.print("Enter new product price: ");
            float newProductPrice = scanner.nextFloat();
            productToEdit.setProduct(newProductName);
            productToEdit.setColor(newProductColor);
            productToEdit.setPrice(newProductPrice);
            System.out.println("Product updated successfully!");
        } else {
            System.out.println("Product not found with ID: " + productId);
        }
    }

    private static void showProducts() {
       System.out.println("=== List of Products ===");
        for (MakeupProduct product : products) {
            System.out.println(product);
        }
    }
    
    private static void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Delete Product ===");
        System.out.print("Enter product ID to delete: ");
        int productId = scanner.nextInt();
        MakeupProduct productToDelete = null;
        for (MakeupProduct product : products) {
            if (product.getId() == productId) {
                productToDelete = product;
                break;
            }
        }
        if (productToDelete != null) {
            products.remove(productToDelete);
            System.out.println("Product deleted successfully!");
        } else {
            System.out.println("Product not found with ID: " + productId);
        }
        }
}