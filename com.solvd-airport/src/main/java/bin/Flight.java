package bin;

public class Flight {

    private int idFlight;
    private int idAirportOrigin;
    private int idAirportDestination;

    public Flight(int idFlight, int idAirportOrigin, int idAirportDestination) {
        this.idFlight = idFlight;
        this.idAirportOrigin = idAirportOrigin;
        this.idAirportDestination = idAirportDestination;
    }

    public int getIdFlight() {
        return idFlight;
    }

    public void setIdFlight(int idFlight) {
        this.idFlight = idFlight;
    }

    public int getIdAirportOrigin() {
        return idAirportOrigin;
    }

    public void setIdAirportOrigin(int idAirportOrigin) {
        this.idAirportOrigin = idAirportOrigin;
    }

    public int getIdAirportDestination() {
        return idAirportDestination;
    }

    public void setIdAirportDestination(int idAirportDestination) {
        this.idAirportDestination = idAirportDestination;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "idFlight=" + idFlight +
                ", idAirportOrigin=" + idAirportOrigin +
                ", idAirportDestination=" + idAirportDestination +
                '}';
    }
}
