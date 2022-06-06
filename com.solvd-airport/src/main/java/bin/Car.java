package bin;

public class Car {

    private int idCar;
    private String plate;
    private String description;

    public Car(int idCar, String plate, String description) {
        this.idCar = idCar;
        this.plate = plate;
        this.description = description;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Car{" +
                "idCar=" + idCar +
                ", plate='" + plate + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
