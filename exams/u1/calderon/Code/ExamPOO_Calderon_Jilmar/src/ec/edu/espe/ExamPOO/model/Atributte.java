
package ec.edu.espe.ExamPOO.model;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class Atributte {
    
    private int id;
    private String nameCallphone;
    private String Model;
/*
    @Override
    public String toString() {
        return "\n\t\tAtributtes" + "\n\tid: " + id + "\n\tnameCallphone: " 
                + nameCallphone + "\n\tModel: " + Model + '}';
    }*/
    
    public Atributte(int id, String nameCallphone, String Model) {
        this.id = id;
        this.nameCallphone = nameCallphone;
        this.Model = Model;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getNameCallphone() {
        return nameCallphone;
    }

    public void setNameCallphone(String nameCallphone) {
        this.nameCallphone = nameCallphone;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }
}
