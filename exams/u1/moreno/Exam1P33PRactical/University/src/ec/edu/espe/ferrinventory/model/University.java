
package ec.edu.espe.ferrinventory.model;

/**
 *
 * @author Paul Moreno,The Encoders,DCCO-ESPE
 */
public class University {
    private String name;
    private String ubication;
    private int numberOfExtencion;

    public University(String name, String ubication, int numberOfExtencion) {
        this.name = name;
        this.ubication = ubication;
        this.numberOfExtencion = numberOfExtencion;
    }

    @Override
    public String toString() {
        return "University\n" + "name=" + name + "\n ubication=" + ubication + "\n numberOfExtencion=" + numberOfExtencion + '\n';
    }
    
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ubication
     */
    public String getUbication() {
        return ubication;
    }

    /**
     * @param ubication the ubication to set
     */
    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    /**
     * @return the numberOfExtencion
     */
    public int getNumberOfExtencion() {
        return numberOfExtencion;
    }

    /**
     * @param numberOfExtencion the numberOfExtencion to set
     */
    public void setNumberOfExtencion(int numberOfExtencion) {
        this.numberOfExtencion = numberOfExtencion;
    }



   
    
}
