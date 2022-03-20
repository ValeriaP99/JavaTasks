package md.pentalog.tasks_part1.chapter9.Ex15;

import md.pentalog.tasks_part1.chapter9.Ex14.Employee;

public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {
        super(firstName, lastName, socialSecurityNumber);
        this.hours = hours;
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours > 0 || hours < 168){
            this.hours = hours;
        }else
        {
            throw new IllegalArgumentException("Hours must be between 0 and 168");
        }

    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0){
            throw new IllegalArgumentException(" Wage must be > 0 ");
        }
        this.wage = wage;
    }

    public double earnings(){
        return getHours() * getWage();
    }

    @Override
    public String toString(){
        return String.format("%s%n %s %n%s: %.2f %n%s: %.2f", "Hourly Employee", super.toString(), "Hours per week", getHours(), "Wage", getWage());
    }
}
