package ec.edu.espe.contacts.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class Contact {
    int id;
    String fullName;
    String contactNumber;
    String phoneNumber; //int
    String email;
    String gender;
    String type;
    Date bornOnDate;
    ArrayList<String> hobbies;
    String comments;
    String fovoriteTeam;
}
