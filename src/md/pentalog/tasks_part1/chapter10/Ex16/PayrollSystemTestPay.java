package md.pentalog.tasks_part1.chapter10.Ex16;

public class PayrollSystemTestPay {
    public static void main(String[] args) {
        SalariedEmployeePay salariedEmployee = new SalariedEmployeePay("John", "Smith",
                "111-11-111", 800.00);
        HourlyEmployeePay hourlyEmployee = new HourlyEmployeePay("Karen", "Price",
                "222-22-222", 16.75, 40);
        CommissionEmployeePay commissionEmployee = new CommissionEmployeePay("Sue", "Jones",
                "333-33-333", 10000, .06);
        BasePlusCommissionEmployeePay basePlusCommissionEmployee = new BasePlusCommissionEmployeePay("Bob", "Lewis",
                "444-44-444", 5000, .04, 300);
        PieceWorkerPay pieceWorker = new PieceWorkerPay("James", "Arthur", "555-55-555", 23.5, 15);

        System.out.println("Employees processes individually: ");

        System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.getPaymentAmount());
        System.out.printf("%n%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.getPaymentAmount());
        System.out.printf("%n%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.getPaymentAmount());
        System.out.printf("%n%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.getPaymentAmount());
        System.out.printf("%n%s%n%s: $%,.2f%n%n", pieceWorker, "earned", pieceWorker.getPaymentAmount());

        EmployeePay[] employees = new EmployeePay[5];

        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = pieceWorker;

        System.out.printf("----------[ Employees procesed polymorphically:]-------------- %n%n");

        for(EmployeePay currentEmployee : employees){

            System.out.println(currentEmployee);

            if (currentEmployee instanceof BasePlusCommissionEmployeePay)
            {
                BasePlusCommissionEmployeePay employee = (BasePlusCommissionEmployeePay) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
            }
            System.out.printf("earned $%,.2f%n%n", currentEmployee.getPaymentAmount());
        }

        for(int j=0; j < employees.length; j++){
            System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
        }
    }
}
