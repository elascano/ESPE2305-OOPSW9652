package ec.edu.espe.observerpattern.controller;

/**
 *
 * @author Jilmar Calderon, Techware, DCCO-ESPE
 */
public class UserView implements Observer {

    private String name;

    public UserView(String name) {
        this.name = name;
    }

    @Override
    public void update(String message, String client) {

    }
}
