package ec.edu.espe.contacts.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class Contact {
    private int id;
    private String fullName;
    private String contactName;
    private String phoneNumber; //int
    private String email;
    private String gender;
    private String type;
    private Date bornOnDate;
    private ArrayList<String> hobbies;
    private String comments;
    private String favoriteTeam;

    public Contact(int id, String fullName, String contactNumber, String phoneNumber, String email, String gender, String type, Date bornOnDate, ArrayList<String> hobbies, String comments, String fovoriteTeam) {
        this.id = id;
        this.fullName = fullName;
        this.contactName = contactNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
        this.type = type;
        this.bornOnDate = bornOnDate;
        this.hobbies = hobbies;
        this.comments = comments;
        this.favoriteTeam = fovoriteTeam;
    }

    @Override
    public String toString() {
        return "Contact " + fullName
                + "\nId= " + id
                + "\nContact Name= " + contactName
                + "\nPhone Number= " + phoneNumber
                + "\nEmail= " + email
                + "\nGender= " + gender
                + "\nType= " + type
                + "\nBorn On Date= " + bornOnDate
                + "\nHobbies= " + hobbies
                + "\nComments= " + comments
                + "\nFavorite Team=" + favoriteTeam;
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


