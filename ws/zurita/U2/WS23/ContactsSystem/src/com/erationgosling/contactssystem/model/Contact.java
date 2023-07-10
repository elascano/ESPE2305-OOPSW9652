/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erationgosling.contactssystem.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Labs-DCCO
 */
public class Contact {
    private int id;
    private String fullName;
    private String contactName;
    private String phoneNumber;
    private String email;
    private String gender;
    private String type;
    private Date bornOnDate;
    private ArrayList<String> hobbies;
    private String comments;
    private String favoriteTeam;

    @Override
    public String toString() {
        return "Contact ingresed:" 
                + "\n"+"-    Id: " + id + "\n" 
                + "\n"+"-    Full Name: " + fullName + "\n"
                + "\n"+"-    Contact Name: " + contactName + "\n"
                + "\n"+"-    Phone Number: " + phoneNumber + "\n"
                + "\n"+"-    E-mail: " + email + "\n"
                + "\n"+"-    Gender : " + gender + "\n"
                + "\n"+"-    Type: " + type + "\n"
                + "\n"+"-    Born On Date: " + bornOnDate + "\n"
                + "\n"+"-    Hobbies: " + hobbies + "\n"
                + "\n"+"-    Comments: " + comments + "\n"
                + "\n"+"-    Favorite Team:" + favoriteTeam;
    }

    
    
    public Contact(int id, String fullName, String contactName, String phoneNumber, String email, String gender, String type, Date bornOnDate, ArrayList<String> hobbies, String comments, String favoriteTeam) {
        this.id = id;
        this.fullName = fullName;
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.type = type;
        this.bornOnDate = bornOnDate;
        this.hobbies = hobbies;
        this.comments = comments;
        this.favoriteTeam = favoriteTeam;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the contactName
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * @param contactName the contactName to set
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the bornOnDate
     */
    public Date getBornOnDate() {
        return bornOnDate;
    }

    /**
     * @param bornOnDate the bornOnDate to set
     */
    public void setBornOnDate(Date bornOnDate) {
        this.bornOnDate = bornOnDate;
    }

    /**
     * @return the hobbies
     */
    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    /**
     * @param hobbies the hobbies to set
     */
    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }

    /**
     * @return the comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * @return the favoriteTeam
     */
    public String getFavoriteTeam() {
        return favoriteTeam;
    }

    /**
     * @param favoriteTeam the favoriteTeam to set
     */
    public void setFavoriteTeam(String favoriteTeam) {
        this.favoriteTeam = favoriteTeam;
    }
    
           
}
