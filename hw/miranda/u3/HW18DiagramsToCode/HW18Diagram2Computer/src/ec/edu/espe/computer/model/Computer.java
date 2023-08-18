package ec.edu.espe.computer.model;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class Computer {
    private String serialNumber;
    private String brand;
    private String model;
    private int ram;
    private float storage;
    private boolean isNew;
    private float price;

    public Computer(String serialNumber, String brand, String model, int ram, float storage, boolean isNew, float price) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.isNew = isNew;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" + 
                "serialNumber=" + getSerialNumber() + 
                ", brand=" + getBrand() + 
                ", model=" + getModel() + 
                ", ram=" + getRam() + 
                ", storage=" + getStorage() + 
                ", isNew=" + isIsNew() + 
                ", price=" + getPrice() + '}';
    }

    /**
     * @return the serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber the serialNumber to set
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the ram
     */
    public int getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * @return the storage
     */
    public float getStorage() {
        return storage;
    }

    /**
     * @param storage the storage to set
     */
    public void setStorage(float storage) {
        this.storage = storage;
    }

    /**
     * @return the isNew
     */
    public boolean isIsNew() {
        return isNew;
    }

    /**
     * @param isNew the isNew to set
     */
    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }
    
    
}
