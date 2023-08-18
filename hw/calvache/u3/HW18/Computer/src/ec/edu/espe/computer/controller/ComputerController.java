package ec.edu.espe.computer.controller;

import ec.edu.espe.computer.model.Computer;
import ec.edu.espe.computer.view.FrmComputer;
import java.util.ArrayList;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class ComputerController {

    FrmComputer frmComputer = new FrmComputer();
    Computer computer = new Computer();
    private ArrayList<Computer> computers;

    public void add(Computer computer) {
    }

    public void delete(String sn) {

    }

    public void find(String sn) {

    }

    public ArrayList<Computer> read() {
        return computers;
    }

    public void update(String sn, Computer computer) {

    }

}
