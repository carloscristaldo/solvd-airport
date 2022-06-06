package bin;

public class CarTicket {

    private int idCarTicket;
    private int idCar;
    private int idPassenger;
    private int idCarRentalAgency;

    public CarTicket(int idCarTicket, int idCar, int idPassenger, int idCarRentalAgency) {
        this.idCarTicket = idCarTicket;
        this.idCar = idCar;
        this.idPassenger = idPassenger;
        this.idCarRentalAgency = idCarRentalAgency;
    }

    public int getIdCarTicket() {
        return idCarTicket;
    }

    public void setIdCarTicket(int idCarTicket) {
        this.idCarTicket = idCarTicket;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public int getIdPassenger() {
        return idPassenger;
    }

    public void setIdPassenger(int idPassenger) {
        this.idPassenger = idPassenger;
    }

    public int getIdCarRentalAgency() {
        return idCarRentalAgency;
    }

    public void setIdCarRentalAgency(int idCarRentalAgency) {
        this.idCarRentalAgency = idCarRentalAgency;
    }

    @Override
    public String toString() {
        return "CarTicket{" +
                "idCarTicket=" + idCarTicket +
                ", idCar=" + idCar +
                ", idPassenger=" + idPassenger +
                ", idCarRentalAgency=" + idCarRentalAgency +
                '}';
    }
}
