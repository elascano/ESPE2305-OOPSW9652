package ec.edu.espe.contacts.model;

import java.util.ArrayList;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class Contact {
    int id;
    String fullName;
    String contactName;
    String phoneNumber;
    String email;
    String gender;
    String type;
    String bornOnDate;
    String hobbies;
    String comments;
    String favoriteTeam;

    @Override
    public String toString() {
        return "\nid: " + id + "\nfullName: " + fullName + "\ncontactName: " + contactName + "\nphoneNumber: " + phoneNumber + "\nemail: " + email + "\ngender: " + gender + "\ntype: " + type + "\nbornOnDate: " + bornOnDate + "\nhobbies: " + hobbies + "\ncomments: " + comments + "\nfavoriteTeam: " + favoriteTeam;
    }

    public Contact(int id, String fullName, String contactName, String phoneNumber, String email, String gender, String type, String bornOnDate, String hobbies, String comments, String favoriteTeam) {
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getBornOnDate() {
        return bornOnDate;
    }

    public void setBornOnDate(String bornOnDate) {
        this.bornOnDate = bornOnDate;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
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
