package bin;

public class FlighTicket {

    private int idFlightTicket;
    private int idPassenger;
    private int idFlight;
    private int idPlane;
    private int idAirport;
    private int idTravelAgency;

    public FlighTicket(int idFlightTicket, int idPassenger, int idFlight, int idPlane, int idAirport, int idTravelAgency) {
        this.idFlightTicket = idFlightTicket;
        this.idPassenger = idPassenger;
        this.idFlight = idFlight;
        this.idPlane = idPlane;
        this.idAirport = idAirport;
        this.idTravelAgency = idTravelAgency;
    }

    public int getIdFlightTicket() {
        return idFlightTicket;
    }

    public void setIdFlightTicket(int idFlightTicket) {
        this.idFlightTicket = idFlightTicket;
    }

    public int getIdPassenger() {
        return idPassenger;
    }

    public void setIdPassenger(int idPassenger) {
        this.idPassenger = idPassenger;
    }

    public int getIdFlight() {
        return idFlight;
    }

    public void setIdFlight(int idFlight) {
        this.idFlight = idFlight;
    }

    public int getIdPlane() {
        return idPlane;
    }

    public void setIdPlane(int idPlane) {
        this.idPlane = idPlane;
    }

    public int getIdAirport() {
        return idAirport;
    }

    public void setIdAirport(int idAirport) {
        this.idAirport = idAirport;
    }

    public int getIdTravelAgency() {
        return idTravelAgency;
    }

    public void setIdTravelAgency(int idTravelAgency) {
        this.idTravelAgency = idTravelAgency;
    }

    @Override
    public String toString() {
        return "FlighTicket{" +
                "idFlightTicket=" + idFlightTicket +
                ", idPassenger=" + idPassenger +
                ", idFlight=" + idFlight +
                ", idPlane=" + idPlane +
                ", idAirport=" + idAirport +
                ", idTravelAgency=" + idTravelAgency +
                '}';
    }
}
