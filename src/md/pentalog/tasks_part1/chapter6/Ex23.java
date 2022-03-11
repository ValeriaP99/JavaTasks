package md.pentalog.tasks_part1.chapter6;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        double n1;
        double n2;
        double n3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers");
        System.out.print("1. = ");
        n1 = scanner.nextDouble();
        System.out.print("2. = ");
        n2 = scanner.nextDouble();
        System.out.print("3. = ");
        n3 = scanner.nextDouble();
        System.out.printf("The smallest value --> %.2f%n", minimum3(n1, n2, n3));
    }
    public static double minimum3(double n1, double n2, double n3){
        double min1;
        double min;
        min1 = Math.min(n1, n2);
        min = Math.min(min1, n3);
        return min;
    }
}
