package md.pentalog.tasks_part1.chapter10.Ex16;

public class BasePlusCommissionEmployeePay extends CommissionEmployeePay{
    private double baseSalary;

    public BasePlusCommissionEmployeePay(String firstName, String lastName, String socialSecurityNumber, double grossSales,
                                         double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if(baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0)
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return getBaseSalary()+super.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f", "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }

    @Override
    public double getPaymentAmount() {
        return earnings();
    }
}
