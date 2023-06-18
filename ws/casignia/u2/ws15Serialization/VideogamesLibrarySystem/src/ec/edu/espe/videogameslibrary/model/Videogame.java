/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.videogameslibrary.model;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class Videogame {
    private String language;
    private String title;
    private String genre;
    private float price;
    private String developer;
    private boolean isMultiplayer;

    @Override
    public String toString() {
        return "\n\t*** Videogames ***\n" +
                "\nTitle: " + title +
                "\nLanguage: " + language +
                "\nGenre: " + genre +
                "\nPrice: " + price +
                "\nDeveloper: " + developer +
                "\nIs Multipleyer: " + isMultiplayer +
                "\n";
    }

    public Videogame(String language, String title, String genre, float price, String developer, boolean isMultiplayer) {
        this.language = language;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.developer = developer;
        this.isMultiplayer = isMultiplayer;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public boolean isIsMultipleyer() {
        return isMultiplayer;
    }

    public void setIsMultipleyer(boolean isMultipleyer) {
        this.isMultiplayer = isMultipleyer;
    }
    
}
