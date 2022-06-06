package bin;

public class Machine {

    private int idMachine;
    private String description;
    private int jobType;

    public Machine(int idMachine, String description, int jobType) {
        this.idMachine = idMachine;
        this.description = description;
        this.jobType = jobType;
    }

    public int getIdMachine() {
        return idMachine;
    }

    public void setIdMachine(int idMachine) {
        this.idMachine = idMachine;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getJobType() {
        return jobType;
    }

    public void setJobType(int jobType) {
        this.jobType = jobType;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "idMachine=" + idMachine +
                ", description='" + description + '\'' +
                ", jobType=" + jobType +
                '}';
    }
}
