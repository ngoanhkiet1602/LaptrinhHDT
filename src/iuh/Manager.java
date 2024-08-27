package iuh;

import java.time.LocalDate;


public class Manager extends SalariedEmployee{

    private double bonus;

    public Manager() {
        super();
        this.bonus = 0.0;
    }

    public Manager(String id, String name, LocalDate dob, double annualSalary, double bonus) {
        super(id, name, dob, annualSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%15.2f", bonus);
    }
}
