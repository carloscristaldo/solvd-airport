package bin;

public class TravelAgency {

    private int idTravelAgency;
    private String name;
    private final int jobType = 1;

    public TravelAgency(int idTravelAgency, String name) {
        this.idTravelAgency = idTravelAgency;
        this.name = name;
    }

    public int getIdTravelAgency() {
        return idTravelAgency;
    }

    public void setIdTravelAgency(int idTravelAgency) {
        this.idTravelAgency = idTravelAgency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJobType() {
        return jobType;
    }

    @Override
    public String toString() {
        return "TravelAgency{" +
                "idTravelAgency=" + idTravelAgency +
                ", name='" + name + '\'' +
                ", jobType=" + jobType +
                '}';
    }
}
