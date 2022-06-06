package bin;

import java.util.ArrayList;

public class Airstrip {

    private final int jobType = 4;
    private int leadId;
    private ArrayList<Integer> employees;

    public Airstrip(int leadId, ArrayList<Integer> employees) {
        this.leadId = leadId;
        this.employees = employees;
    }

    public int getJobType() {
        return jobType;
    }

    public int getLeadId() {
        return leadId;
    }

    public void setLeadId(int leadId) {
        this.leadId = leadId;
    }

    public ArrayList<Integer> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Integer> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Hangar{" +
                "jobType=" + jobType +
                ", leadId=" + leadId +
                ", employees=" + employees +
                '}';
    }
}
