package md.pentalog.tasks_part1.chapter4;

// Credit Limit Calculator

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        int accountNumber;
        int oldBalance;
        int charges;
        int credits;
        int creditLimit;
        int newBalance;
        int counter = 0;
        String yesOrNo;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want add some information (for yes write -> y and for no -> n)?  --> ");
        yesOrNo = scanner.next();

        while(!yesOrNo.equals("n")){
            counter += 1;
            System.out.printf("%n------------[ %d Account ]------------%n", counter);
            System.out.print("Account number: ");
            accountNumber = scanner.nextInt();
            System.out.print("Initial balance: ");
            oldBalance = scanner.nextInt();
            System.out.print("Charges: ");
            charges = scanner.nextInt();
            System.out.print("Credits: ");
            credits = scanner.nextInt();
            System.out.print("Credit limit: ");
            creditLimit = scanner.nextInt();
            newBalance = oldBalance + charges - credits;
            System.out.printf("New balance: %d%n", newBalance);

            if(newBalance > creditLimit){
                System.out.println("******[ Credit Limit Exceeded!!!]******");
            }

            System.out.print("%nDo you want add some information (for yes write -> y and for no -> n)?  --> ");
            yesOrNo = scanner.next();
        }
    }
}
