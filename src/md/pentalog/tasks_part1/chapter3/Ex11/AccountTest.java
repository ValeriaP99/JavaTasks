package md.pentalog.tasks_part1.chapter3.Ex11;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());

        Scanner scanner = new Scanner(System.in);
        double depositAmount;

        System.out.print("Enter deposit amount for account1: ");
        depositAmount = scanner.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = scanner.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        double withdrawalAmount;
        System.out.printf("%nEnter withdraws money for account1: ");
        withdrawalAmount = scanner.nextDouble();
        System.out.printf("%nwithdrawing %.2f from account1%n%n", withdrawalAmount);
        account1.withdraw(withdrawalAmount);
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        System.out.printf("%nEnter withdraws money for account2: ");
        withdrawalAmount = scanner.nextDouble();
        System.out.printf("%nwithdrawing %.2f from account2%n%n", withdrawalAmount);
        account2.withdraw(withdrawalAmount);
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

    }
}
