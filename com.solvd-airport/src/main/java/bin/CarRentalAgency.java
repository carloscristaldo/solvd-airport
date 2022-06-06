package bin;

public class CarRentalAgency {

    private int idCarRentalAgency;
    private String name;
    private String owner;
    private final int jobType = 2;

    public CarRentalAgency(int idCarRentalAgency, String name, String owner) {
        this.idCarRentalAgency = idCarRentalAgency;
        this.name = name;
        this.owner = owner;
    }

    public int getIdCarRentalAgency() {
        return idCarRentalAgency;
    }

    public void setIdCarRentalAgency(int idCarRentalAgency) {
        this.idCarRentalAgency = idCarRentalAgency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getJobType() {
        return jobType;
    }

    @Override
    public String toString() {
        return "CarRentalAgency{" +
                "idCarRentalAgency=" + idCarRentalAgency +
                ", name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", jobType=" + jobType +
                '}';
    }
}
