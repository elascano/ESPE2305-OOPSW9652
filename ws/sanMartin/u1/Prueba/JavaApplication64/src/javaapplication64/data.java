/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication64;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.*;
import java.io.*;
/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class data {
    public void jsonUsers(){
     Scanner sc = new Scanner(System.in);
        System.out.println("add useranme");
        String name = sc.next();
        System.out.println("add password");
        String password = sc.next();
     JSONObject obj = new JSONObject();     
     JSONArray jrr = new JSONArray();
     obj.put("Username", name);
     obj.put("Password",password); 
      try{
        FileWriter file = new FileWriter("datos.json");
       file.write(jrr.toJSONString());
       file.close();
        }
        catch(Exception ex){
            System.out.println("Error");
        }
     
    }
    public void comparate(){
        JSONObject obj = new JSONObject();
        JSONArray jrr = new JSONArray();
         if(obj.equals(jrr.get(0))){
         System.out.println("Nice");
     }else{
             System.out.println("No");
         }
    }
    public void writter(){
       
    }
}
