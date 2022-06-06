package bin;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;
import java.util.Objects;

public class AirportExtended {
    @XmlAttribute(name = "id")
    private int id;

    @XmlElement(name = "reportid")
    private int reportid;

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "shortname")
    private String shortname;

    @XmlElement(name = "jobtype")
    private int jobtype;

    public AirportExtended() {
    }

    public AirportExtended(int id, int reportid, String name, String shortname, int jobtype) {
        this.id = id;
        this.reportid = reportid;
        this.name = name;
        this.shortname = shortname;
        this.jobtype = jobtype;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReportid() {
        return reportid;
    }

    public void setReportid(int reportid) {
        this.reportid = reportid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public int getJobtype() {
        return jobtype;
    }

    public void setJobtype(int jobtype) {
        this.jobtype = jobtype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AirportExtended)) return false;
        AirportExtended that = (AirportExtended) o;
        return getId() == that.getId() && getReportid() == that.getReportid() && getJobtype() == that.getJobtype() && Objects.equals(getName(), that.getName()) && Objects.equals(getShortname(), that.getShortname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getReportid(), getName(), getShortname(), getJobtype());
    }

    @Override
    public String toString() {
        return "AirportExtended{" +
                "id=" + id +
                ", reportid=" + reportid +
                ", name='" + name + '\'' +
                ", shortname='" + shortname + '\'' +
                ", jobtype=" + jobtype +
                '}';
    }
}
