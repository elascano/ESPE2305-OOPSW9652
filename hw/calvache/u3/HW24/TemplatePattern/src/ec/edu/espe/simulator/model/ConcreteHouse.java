package ec.edu.espe.simulator.model;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public class ConcreteHouse extends Construction{

    @Override
    public void prepareFoundation() {
        System.out.println("Preparing concrete foundation.");
    }

    @Override
    public void buildStructure() {
        System.out.println("Building concrete structure.");
    }

    @Override
    public void addRoofs() {
        System.out.println("Adding concrete ceilings.");
    }

    @Override
    public void addWalls() {
        System.out.println("Añadiendo paredes de concreto.");
    }

    @Override
    public void housePainting() {
        System.out.println("Painting the concrete house.");
    }
    
}
