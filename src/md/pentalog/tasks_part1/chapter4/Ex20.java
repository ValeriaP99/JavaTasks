package md.pentalog.tasks_part1.chapter4;

public class Ex20 {
    public static void main(String[] args) {
        EmployeeSalary employeeSalary1 = new EmployeeSalary("John Blue", 40, 40.6);
        EmployeeSalary employeeSalary2 = new EmployeeSalary("Ramses II", 56, 45);
        EmployeeSalary employeeSalary3 = new EmployeeSalary("Nefertari VII", 34, 39.5);

        employeeSalary1.getGrossPay(employeeSalary1.getHours(), employeeSalary1.getSalaryPerHour());
        System.out.println(employeeSalary1.toString());
        employeeSalary2.getGrossPay(employeeSalary2.getHours(), employeeSalary2.getSalaryPerHour());
        System.out.println(employeeSalary2.toString());
        employeeSalary3.getGrossPay(employeeSalary3.getHours(), employeeSalary3.getSalaryPerHour());
        System.out.println(employeeSalary3.toString());
    }
}
