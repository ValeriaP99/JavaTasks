package md.pentalog.tasks_part1.chapter4;

public class EmployeeSalary {
    private String name;
    private int hours;
    private double salaryPerHour;

    public EmployeeSalary(String name, int hours, double salaryPerHour) {
        this.name = name;
        this.hours = hours;
        this.salaryPerHour = salaryPerHour;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public double getGrossPay(int hours, double salaryPerHour){
        double total = hours * salaryPerHour;
        if(hours > 40){
            total = (40*salaryPerHour) + ((hours-40)*(salaryPerHour/2));
        }
        return total;
    }

    @Override
    public String toString() {
        return "Employee Information\n{" + "\n" +
                "   Name: " + name + "\n" +
                "   Hours: " + hours + "\n" +
                "   Salary per hour: " + salaryPerHour + "\n" +
                "   Gross pay=: " + getGrossPay(getHours(), getSalaryPerHour()) + "\n" +
                '}';
    }
}
