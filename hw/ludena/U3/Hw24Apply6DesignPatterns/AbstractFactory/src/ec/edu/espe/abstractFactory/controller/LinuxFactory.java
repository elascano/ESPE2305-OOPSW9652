package ec.edu.espe.abstractFactory.controller;

import ec.edu.espe.abstractFactory.model.Button;
import ec.edu.espe.abstractFactory.model.LinuxButton;
import ec.edu.espe.abstractFactory.model.LinuxMenu;
import ec.edu.espe.abstractFactory.model.Menu;

/**
 *
 * @author LENOVO
 */
public class LinuxFactory extends GUIFactory{

    public LinuxFactory() {
    }
    public Button createButton(){
        return(new LinuxButton());
    }
    
    public Menu createMenu(){
        return(new LinuxMenu());
    }
}
