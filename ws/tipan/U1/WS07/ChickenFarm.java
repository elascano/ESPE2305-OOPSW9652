/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chickenfarm.view;

import com.mycompany.chickenfarm.model.Chicken;
import com.mycompany.chickenfarm.model.ChickenFarmer;
import com.mycompany.chickenfarm.model.Egg;
import com.mycompany.chickenfarm.model.Poop;

/**
 *
 * @author Oswaldo Tipan
 */
public class ChickenFarm {
        
    public static void main(String[] args){
        
        Chicken chicken;
        Poop poop;
        Egg egg;
        ChickenFarmer chickenFarmer;
        int a; 
        a=0;
        
        chicken = new Chicken();
        String name;
        name = "Oswaldo Tipán";
        
        System.out.println("Mi name is: "+ name);
        
        System.out.println("Chicken --> "+ chicken);
        System.out.println("This is an int --> "+a);
    } 
}
