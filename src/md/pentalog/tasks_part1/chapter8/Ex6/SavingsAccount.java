package md.pentalog.tasks_part1.chapter8.Ex6;

public class SavingsAccount {
    static double annualInterestRate = 0.0;
    private double savingsBalance = 0.0;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest(double savingsBalance, double annualInterestRate){
        double newSavingsBalance = (savingsBalance * annualInterestRate)/12;
        savingsBalance += newSavingsBalance;

        return savingsBalance += newSavingsBalance;
    }

    public static void modifyInterestRate(double newAnnualInterest){
        annualInterestRate = newAnnualInterest;
    }

}
