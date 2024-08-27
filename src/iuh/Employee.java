package iuh;

import java.time.LocalDate;



public class Employee {
    protected String id;
    protected String name;
    protected LocalDate dob;

    public Employee() {
        this ("", "", LocalDate.now());
    }

    public Employee(String id, String name, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    // Tính lương hàng tuần
    public double weeklySalary() {
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format("%-10s%-25s%15s%10.2f", this.id, this.name, this.dob, this.weeklySalary());
    }
}
