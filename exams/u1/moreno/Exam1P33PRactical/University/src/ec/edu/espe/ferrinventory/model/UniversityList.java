
package ec.edu.espe.ferrinventory.model;

import java.util.ArrayList;

/**
 *
 * @author Moreno Paul,The encoders; DCCO-ESPE
 */
public class UniversityList {
     private int Id;
     private ArrayList<University> University;

    @Override
    public String toString() {
        return "UniversityList\n" + "Id=" + Id + "\n University=" + University + '}';
    }
     
     

    public UniversityList(int Id, ArrayList<University> University) {
        this.Id = Id;
        this.University = University;
    }
     

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the University
     */
    public ArrayList<University> getUniversity() {
        return University;
    }

    /**
     * @param University the University to set
     */
    public void setUniversity(ArrayList<University> University) {
        this.University = University;
    }

    
}
