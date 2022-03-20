package md.pentalog.tasks_part1.chapter9.Ex15;

public class HourlyEmployeeTest {
    public static void main(String[] args) {
        HourlyEmployee employee = new HourlyEmployee("John", "Black", "555-55-5555",
                100, 50);

        System.out.println("****** Hourly employee ******");
        System.out.printf("%s: %s%n", "First name is ", employee.getFirstName());
        System.out.printf("%s: %s%n", "Last name is ", employee.getLastName());
        System.out.printf("%s: %s%n", "Social security number is ", employee.getSocialSecurityNumber());
        System.out.printf("%s: %.2f%n", "Hours per week is ", employee.getHours());
        System.out.printf("%s: %.2f%n", "Wage is ", employee.getWage());
        System.out.printf("%s: %.2f%n", "Earnings is  ", employee.earnings());

        System.out.println();
        employee.setHours(23.5);
        employee.setWage(45.0);

        System.out.printf("%s%n%s%.2f", employee.toString(), "Earnings is ", employee.earnings());
    }
}
