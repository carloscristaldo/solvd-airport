package bin;

public class Passenger extends Person{

    private int idPassenger;
    private String passportNumber;
    private int classTicket;

    public Passenger(String firstName, String lastName, int idPassenger, String passportNumber, int classTicket) {
        super(firstName, lastName);
        this.idPassenger = idPassenger;
        this.passportNumber = passportNumber;
        this.classTicket = classTicket;
    }

    public int getIdPassenger() {
        return idPassenger;
    }

    public void setIdPassenger(int idPassenger) {
        this.idPassenger = idPassenger;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public int getClassTicket() {
        return classTicket;
    }

    public void setClassTicket(int classTicket) {
        this.classTicket = classTicket;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "firstName=" + super.getFirstName() +
                "lastName=" + super.getLastName() +
                "idPassenger=" + idPassenger +
                ", passportNumber='" + passportNumber + '\'' +
                ", classTicket=" + classTicket +
                '}';
    }
}
