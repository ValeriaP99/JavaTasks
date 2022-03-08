package md.pentalog.tasks_part1.chapter3.Ex13;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Blue", 500);
        Employee employee2 = new Employee("Ariadna", "Crock", 700);

        showYearlySalary(employee1);
        showYearlySalary(employee2);

        System.out.println("-----[ Salary increased with 10% ]-----");
        employee1.setMonthlySalary(employee1.getMonthlySalary()*1.1);
        employee2.setMonthlySalary(employee2.getMonthlySalary()*1.1);
        showYearlySalary(employee1);
        showYearlySalary(employee2);

    }

    public static void showYearlySalary(Employee employee){
        System.out.println("\n--------[ Yearly salary ]---");
        System.out.printf("Employee first name: %s%n", employee.getFirstName());
        System.out.printf("Employee last name: %s%n", employee.getLastName());
        System.out.printf("Employee monthly salary: %.2f%n", employee.getMonthlySalary());
        System.out.printf("Employee yearly salary: %.2f%n", (employee.getMonthlySalary()*12));
        System.out.println("-----------------------------\n");
    }
}
