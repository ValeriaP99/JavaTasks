package md.pentalog.tasks_part1.chapter8.Ex8;

import java.util.Scanner;

public class TestDate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year:  ");
        int year = input.nextInt();
        System.out.print("Enter the month:  ");
        int month = input.nextInt();
        nextMonth(month, year);
        nextYear(year);
    }

    static void nextYear(int year) {
        System.out.printf("Year %d:%n%n",year);
        Date date1 = new Date(1,1,year);
        for (int i = 0; i < 367; i++) {
            System.out.println("Date:  " + date1);
            date1.nextDay();
            System.out.println("Date + 1 day:  " + date1);
            System.out.println();
        }
    }

    static void nextMonth(int month, int year) {
        System.out.printf("Month %d:%n%n",month);
        Date date1 = new Date(month, 1, year);
        for (int i = 0; i < 31; i++) {
            System.out.println("Date:  " + date1);
            date1.nextDay();
            System.out.println("Date + 1 day:  " + date1);
            System.out.println();
        }
    }
}
