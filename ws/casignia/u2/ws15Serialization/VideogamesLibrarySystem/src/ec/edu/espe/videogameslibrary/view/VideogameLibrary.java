package ec.edu.espe.videogameslibrary.view;

import java.io.FileNotFoundException;

/**
 *
 * @author Diego Casignia, Techware, DCCO-ESPE
 */
public class VideogameLibrary {
    public static void main(String[] args) throws FileNotFoundException {
        Menu menu = new Menu();
        menu.showMenu();
    }
}
