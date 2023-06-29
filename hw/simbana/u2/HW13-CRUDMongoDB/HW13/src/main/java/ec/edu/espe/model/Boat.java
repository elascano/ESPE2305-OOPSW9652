package ec.edu.espe.model;

public class Boat {
    private int id;
    private String color;
    private String brandMark;
    private String status;

    public Boat(int id, String color, String marca, String status) {
        this.id = id;
        this.color = color;
        this.brandMark = marca;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public String getBrandMark() {
        return brandMark;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", marca='" + brandMark + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}