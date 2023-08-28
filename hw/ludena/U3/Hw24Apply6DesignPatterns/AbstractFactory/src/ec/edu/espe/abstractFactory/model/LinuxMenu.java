
package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author LENOVO
 */
public class LinuxMenu extends Menu{

    private String data;
    @Override
    public void paint() {
        data = "Im a LinuxMenu: " + caption;
    }
    
    public String getData() {
        return data;
    }
}
