/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.videogamessales.view;

import ec.edu.espe.tax.SalesTax;
import ec.edu.espe.videogamessales.model.VideoGame;

/**
 *
 * @author Oswaldo Tipan
 */
public class VideoGamesSalesSystem {
    
    public static void main(String[] arg){
        
        VideoGame videoGame;
        
        float price; 
        price = 60.0F;
        
        float ivaPercentage = 35.0F;
        float totalPrice;
        totalPrice = SalesTax.computeIva(price, ivaPercentage);
        
        System.out.println("Oswaldo Tipán Video Games");
        
        videoGame = new VideoGame(1,"Mario","Nintendo", price, totalPrice);
       
        System.out.println("pair of shoes --> "+ videoGame);
        
    }  
}
