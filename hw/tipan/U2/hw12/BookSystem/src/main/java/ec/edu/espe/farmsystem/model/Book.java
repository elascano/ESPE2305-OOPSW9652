/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.farmsystem.model;

/**
 *
 * @author PabloEZurita
 */
public class Book {
    private int id;
    private String title;
    private String author;
    private String dateOfPublication;
    
    
    
    public Book(int id, String title, String author, String dateOfPublication) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.dateOfPublication = dateOfPublication;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(String dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    @Override
    public String toString() {
        String printBook = "Book"+"\n" +
                "      Id: " + getId()+ "\n" +
                "      Title: " + getTitle() + "\n" +
                "      Author: " +getAuthor() + "\n" +
                "      Date of publication: " +getDateOfPublication() + '}';
        return printBook;
    }
    
}
