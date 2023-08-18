package ec.edu.espe.computer.model;

/**
 *
 * @author Calvache Gabriel, Techware, DCCO-ESPE
 */
public class Computer {

    private String serialNumber;
    private String brand;
    private String model;
    private int ram;
    private float storage;
    private boolean New;
    private float price;

    public Computer(String serialNumber, String brand, String model, int ram, float storage, boolean New, float price) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.New = New;
        this.price = price;
    }

    public Computer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "Computer{" + "serialNumber=" + serialNumber + ", brand=" + brand + ", model=" + model + ", ram=" + ram + ", storage=" + storage + ", New=" + New + ", price=" + price + '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public float getStorage() {
        return storage;
    }

    public void setStorage(float storage) {
        this.storage = storage;
    }

    public boolean isNew() {
        return New;
    }

    public void setNew(boolean New) {
        this.New = New;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
