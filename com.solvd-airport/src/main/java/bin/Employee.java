package bin;

import util.enums.Jobs;

public  class Employee extends Person {

    private int idEmployee;
    private int jobType;
    private Jobs job;

    public Employee(String firstName, String lastName, int idEmployee, int jobType, Jobs job) {
        super(firstName, lastName);
        this.idEmployee = idEmployee;
        this.jobType = jobType;
        this.job = job;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public int getJobType() {
        return jobType;
    }

    public void setJobType(int jobType) {
        this.jobType = jobType;
    }

    public Jobs getJob() {
        return job;
    }

    public void setJob(Jobs job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName=" +  super.getFirstName() +
                "lastName=" +  super.getLastName() +
                "idEmployee=" + idEmployee +
                ", jobType=" + jobType +
                ", job=" + job +
                '}';
    }
}
