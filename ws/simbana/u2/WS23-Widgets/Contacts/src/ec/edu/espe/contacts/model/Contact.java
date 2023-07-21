/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.contacts.model;

import java.util.ArrayList;

/**
 *
 * @author Michael Simbana, POO-ERATION, DCCO-ESPE
 */
public class Contact {
    private int id;
    private String fullName;
    private String contactName;
    private String phoneNumber;
    private String email;
    private String gender;
    private String type;
    private String bornOnDate;
    private ArrayList<String> hobbies;
    private String comments;
    private String favoriteTeam;

    public Contact(int id, String fullName, String contactName, String phoneNumber, String email, String gender, String type, String bornOndDate, ArrayList<String> hobbies, String comments, String favoriteTeam) {
        this.id = id;
        this.fullName = fullName;
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.type = type;
        this.bornOnDate = bornOndDate;
        this.hobbies = hobbies;
        this.comments = comments;
        this.favoriteTeam = favoriteTeam;
    }

    @Override
    public String toString() {
        return "Contact" + "\nid= " + 
                id + "\nFull Name= " + 
                fullName + "\nContact Name= " + 
                contactName + "\nPhone Number= " + 
                phoneNumber + "\nE-mail= " + 
                email + "\nGender= " + 
                gender + "\nType= " + 
                type + "\nBorn On Date= " + 
                bornOnDate + "\n Hobbies= " + 
                hobbies.get(0) + "\n Comments= " + 
                comments + "\n Favorite Team= " + favoriteTeam;
    }

    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBornOndDate() {
        return bornOnDate;
    }

    public void setBornOndDate(String bornOndDate) {
        this.bornOnDate = bornOndDate;
    }

    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getFavoriteTeam() {
        return favoriteTeam;
    }

    public void setFavoriteTeam(String favoriteTeam) {
        this.favoriteTeam = favoriteTeam;
    }
    
    
    
}
