package hrms.project.entities;

import javax.persistence.*;

@Entity
@Table(name="jobPositions")
public class JobPositions {
    @Id
    @GeneratedValue
    @Column(name = "job_id")
    private int id;

    @Column(name = "job_position")
    private String position;

    @Column(name="job_salary")
    private int salary;

    public JobPositions() {
    }

    public JobPositions(int id, String position, int salary) {
        this.id = id;
        this.position = position;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "JobPositions{" +
                "id=" + id +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
