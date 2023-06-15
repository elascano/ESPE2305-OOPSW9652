
package ec.edu.espe.librarymanager.utils;

import ec.edu.espe.librarymanager.model.Book;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Oswaldo Tipan
 */
public class FileManager {
    
    public static ArrayList<Object> bookArrayList = new ArrayList<>();
    
    
    public static void askForData() throws IOException{
        
        Scanner dataIn = new Scanner(System.in);
        
        System.out.println("Insert the id of the Book: ");
        int id = dataIn.nextInt();
        dataIn.nextLine();
        System.out.println("Insert the Title of the Book: ");
        String title = dataIn.nextLine();
        System.out.println("Insert the Author of the Book: ");
        String author = dataIn.next();
        System.out.println("Insert the Publication Year of the Book: ");
        int publicationYear = dataIn.nextInt();
        System.out.println("Insert the Editorial of the Book: ");
        String editorial = dataIn.next();
        System.out.println("Insert the Publication City of the Book: ");
        String publicationCity = dataIn.next();
        
        loadBook();
        addBook(id, publicationYear, title, author, editorial, publicationCity);
        
    }
    
    public static void addBook(int id, int publicationYear, String title, String author, String editorial,
        String publicationCity) throws IOException {
        Book book = new Book(id, publicationYear, title, author, editorial, publicationCity);
        bookArrayList.add(book);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("data\\book.dat"))) {
            outputStream.writeObject(bookArrayList);
            System.out.println("El objeto ha sido guardado en objecto.dat");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
        public static void loadBook() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("data\\book.dat"))) {
            ArrayList<Object> existingBooks = (ArrayList<Object>) inputStream.readObject();
            if (existingBooks != null) {
                bookArrayList.addAll(existingBooks);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading books from file: " + e.getMessage());
        }
    }

    public static void showAllBooks() throws FileNotFoundException, IOException {
        
        
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("data\\book.dat"))){
            ArrayList<Object> bookArrayList = (ArrayList<Object>) inputStream.readObject();
            
            if (bookArrayList.isEmpty()) {
                System.out.println("No books found.");
            } else {
                System.out.println("All Books:");
                System.out.println("-----------------------");
                for (Object object : bookArrayList) {
                    Book book = (Book) object;
                    System.out.println("ID: " + book.getId());
                    System.out.println("Title: " + book.getTittle());
                    System.out.println("Author: " + book.getAuthor());
                    System.out.println("Publication Year: " + book.getpublicationYear());
                    System.out.println("Editorial: " + book.getEditorial());
                    System.out.println("Publication City: " + book.getPublicationCity());
                    System.out.println("-------------------");
                }
            }
        }   catch (IOException | ClassNotFoundException e){
                System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
