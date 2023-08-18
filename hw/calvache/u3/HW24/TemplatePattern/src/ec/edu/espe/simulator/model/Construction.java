package ec.edu.espe.simulator.model;

/**
 *
 * @author Gabriel Baez, Techware, DCCO-ESPE
 */
public abstract class Construction {

    public final String buildHouse() {
        prepareFoundation();
        buildStructure();
        addRoofs();
        addWalls();
        housePainting();
        return "House builded";
    }

    public abstract void prepareFoundation();

    public abstract void buildStructure();

    public abstract void addRoofs();

    public abstract void addWalls();

    public abstract void housePainting();

}
