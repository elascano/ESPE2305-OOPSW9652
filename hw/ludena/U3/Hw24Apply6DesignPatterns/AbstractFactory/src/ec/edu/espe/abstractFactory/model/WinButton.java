package ec.edu.espe.abstractFactory.model;

/**
 *
 * @author LENOVO
 */
public class WinButton extends Button {

    private String data;

    public void paint() {
        data = "Im a WinButton: " + caption;
    }

    public String getData() {
        return data;
    }
}
