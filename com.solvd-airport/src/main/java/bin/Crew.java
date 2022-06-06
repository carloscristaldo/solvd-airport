package bin;

import java.util.ArrayList;

public class Crew {

    private int idCrew;
    private int idPilot;
    private int idCoPilot;
    private int idStewardessLead;
    private ArrayList<Integer> stewardesses;

    public Crew(int idCrew, int idPilot, int idCoPilot, int idStewardessLead, ArrayList<Integer> stewardesses) {
        this.idCrew = idCrew;
        this.idPilot = idPilot;
        this.idCoPilot = idCoPilot;
        this.idStewardessLead = idStewardessLead;
        this.stewardesses = stewardesses;
    }

    public int getIdCrew() {
        return idCrew;
    }

    public void setIdCrew(int idCrew) {
        this.idCrew = idCrew;
    }

    public int getIdPilot() {
        return idPilot;
    }

    public void setIdPilot(int idPilot) {
        this.idPilot = idPilot;
    }

    public int getIdCoPilot() {
        return idCoPilot;
    }

    public void setIdCoPilot(int idCoPilot) {
        this.idCoPilot = idCoPilot;
    }

    public int getIdStewardessLead() {
        return idStewardessLead;
    }

    public void setIdStewardessLead(int idStewardessLead) {
        this.idStewardessLead = idStewardessLead;
    }

    public ArrayList<Integer> getStewardesses() {
        return stewardesses;
    }

    public void setStewardesses(ArrayList<Integer> stewardesses) {
        this.stewardesses = stewardesses;
    }

    @Override
    public String toString() {
        return "Crew{" +
                "idCrew=" + idCrew +
                ", idPilot=" + idPilot +
                ", idCoPilot=" + idCoPilot +
                ", idStewardessLead=" + idStewardessLead +
                ", stewardesses=" + stewardesses +
                '}';
    }
}
