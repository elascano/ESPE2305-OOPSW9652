
package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author LENOVO
 */
public class WinMenu extends Menu{

    private String data;
    @Override
    public void paint() {
        data = "Im a WinMenu; " + caption;
    }
    
    public String getData() {
        return data;
    }
}
