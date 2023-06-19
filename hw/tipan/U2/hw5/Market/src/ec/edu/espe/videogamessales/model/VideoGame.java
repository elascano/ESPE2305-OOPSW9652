/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.videogamessales.model;

/**
 *
 * @author Oswaldo Tipan
 */
public class VideoGame {
    int id;
    String title;
    String platform;
    float price;
    float totalPrice;

    @Override
    public String toString() {
        return "VideoGame{" + "id=" + id + ", title=" + title + ", platform=" + platform + ", price=" + price + ", totalPrice=" + totalPrice + '}';
    }
    
    public VideoGame(int id, String title, String platform, float price, float totalPrice) {
        this.id = id;
        this.title = title;
        this.platform = platform;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPlatform() {
        return platform;
    }

    public float getPrice() {
        return price;
    }

    public float getTotalPrice() {
        return totalPrice;
    }
}
