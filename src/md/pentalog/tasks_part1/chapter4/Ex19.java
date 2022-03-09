package md.pentalog.tasks_part1.chapter4;

// Sales Commission Calculator

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        String yesOrNo;
        double totalItem1;
        double totalItem2;
        double totalItem3;
        double totalItem4;
        double total;
        int numberOfItems;
        int id = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want add some information (for yes write -> y and for no -> n)?  --> ");
        yesOrNo = scanner.next();

        while(!yesOrNo.equals("n")){
            id += 1;
            System.out.println();
            System.out.println("Enter the number of each items which were sold by this salesperson");
            System.out.printf("------------[ Salesperson %d ]------------%n", id);
            System.out.print("Item1 ($239,99) = ");
            numberOfItems = scanner.nextInt();
            totalItem1 = numberOfItems * 239.99;
            System.out.print("Item2 ($129,75) = ");
            numberOfItems = scanner.nextInt();
            totalItem2 = numberOfItems * 129.75;
            System.out.print("Item3 ($99,95) = ");
            numberOfItems = scanner.nextInt();
            totalItem3 = numberOfItems * 99.95;
            System.out.print("Item4 ($350.89) = ");
            numberOfItems = scanner.nextInt();
            totalItem4 = numberOfItems * 350.89;
            total = totalItem1 + totalItem2 + totalItem3 + totalItem4;

            System.out.println("--------[ Total for week ]--------");
            System.out.printf("Weekly sale --> %.2f%n", total);
            System.out.printf("Weekly earnings --> $%.2f%n", (200+(total*0.09)));
            System.out.println("----------------------------------------------------------%n");

            System.out.print("Do you want add some information (for yes write -> y and for no -> n)?  --> ");
            yesOrNo = scanner.next();
        }
    }
}
