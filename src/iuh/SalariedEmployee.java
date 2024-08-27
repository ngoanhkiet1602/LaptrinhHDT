package iuh;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    protected double annualSalary;

    public SalariedEmployee() {
        super();
        this.annualSalary = 0.0;
    }

    public SalariedEmployee(String id, String name, LocalDate dod, double annualSalary) {
        super(id, name, dod);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%15.2f", annualSalary);
    }
}
