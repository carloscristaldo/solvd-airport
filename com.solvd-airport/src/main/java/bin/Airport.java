package bin;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Airport {
    @JsonProperty(value ="id_Airport")
    private int idAirport;
    @JsonProperty(value ="name")
    private String name;
    @JsonProperty(value ="shortName")
    private String shortName;
    @JsonProperty(value ="jobType")
    private final int jobType = 0;

    public Airport(){}

    public Airport(int idAirport, String name, String shortName) {
        this.idAirport = idAirport;
        this.name = name;
        this.shortName = shortName;
    }

    public Airport(String name, String shortName) {
        this.name = name;
        this.shortName = shortName;
    }

    public int getIdAirport() {
        return idAirport;
    }

    public void setIdAirport(int idAirport) {
        this.idAirport = idAirport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getJobType() {
        return jobType;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "idAirport=" + idAirport +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", jobType=" + jobType +
                '}';
    }
}
