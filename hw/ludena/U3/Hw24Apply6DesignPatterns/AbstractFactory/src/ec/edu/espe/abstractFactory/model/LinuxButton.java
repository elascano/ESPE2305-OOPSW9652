
package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author LENOVO
 */
public class LinuxButton extends Button {

    private String data;
    @Override
    public void paint(){
        data = "Im a LinuxButton: " + caption;
    }
    
    public String getData() {
        return data;
    }
}
