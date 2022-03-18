package md.pentalog.tasks_part1.chapter8.Ex6;

import md.pentalog.tasks_part1.chapter7.Ex21;

public class TestSavingAccount {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        showMonthlyInterest(saver1, saver2, 0.04);
        System.out.println();
        showMonthlyInterest(saver1, saver2, 0.05);

    }
    public static void showMonthlyInterest(SavingsAccount saver1, SavingsAccount saver2, double annualInterest){
        SavingsAccount.modifyInterestRate(annualInterest);

        System.out.println("-----------[ Monthly Interest ]----------");
        System.out.printf("| Annual interest rate = %.0f%c             |%n", (SavingsAccount.getAnnualInterestRate()*100), '%');
        Ex21.drawBorderLine(41, '-');
        System.out.printf("The monthly interest for saver1 = %.2f%n",
                saver1.calculateMonthlyInterest(saver1.getSavingsBalance(),
                        SavingsAccount.getAnnualInterestRate()));
        System.out.printf("The monthly interest for saver2 = %.2f%n",
                saver2.calculateMonthlyInterest(saver2.getSavingsBalance(),
                        SavingsAccount.getAnnualInterestRate()));
        Ex21.drawBorderLine(41, '-');
    }
}
