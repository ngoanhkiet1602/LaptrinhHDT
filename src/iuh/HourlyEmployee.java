package iuh;

import java.time.LocalDate;


public class HourlyEmployee extends Employee {
    private static final  int HOURSWORKED_MAX = 40;
    private int hoursWorked;
    private double hourlyWage;

    public HourlyEmployee(String e01, String ngoAnhKiet, LocalDate localDate) {
        super();
        this.hoursWorked = 0;
        this.hourlyWage = 0.0;
    }

    public HourlyEmployee(String id, String name, LocalDate dob, int hoursWorked, double hourlyWage) {
        // Gọi constructor của lớp cha
        super(id, name, dob);

        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%5d%15.2f", hoursWorked, hourlyWage);
    }

    @Override
    public double weeklySalary() {
        return hoursWorked <= HOURSWORKED_MAX ? hoursWorked * hourlyWage :
                (HOURSWORKED_MAX + (hoursWorked - HOURSWORKED_MAX) * 1.5) * hourlyWage;
    }
}
