
package ec.edu.espe.abstractFactory.controller;

import ec.edu.espe.abstractFactory.model.Button;
import ec.edu.espe.abstractFactory.model.Menu;

/**
 *
 * @author LENOVO
 */
public abstract class GUIFactory {
    public static GUIFactory getFactory(int sysValue) {
        if (sysValue == 0)
            return new WinFactory();
        else
            return new LinuxFactory();
    }

    
    public abstract Button createButton();
    public abstract Menu createMenu();
}
