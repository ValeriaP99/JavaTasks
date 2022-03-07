package md.pentalog.tasks_part1.chapter2;

import md.pentalog.Main;

import java.util.PrimitiveIterator;
import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        int radius;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius --> ");
        radius = scanner.nextInt();

        System.out.printf("Diameter = %.2f%n", ((double)2 * radius));
        System.out.printf("Circumference = %.2f%n", ((double)2 * Math.PI * radius));
        System.out.printf("Area = %.2f%n", ((double)Math.PI * Math.pow(radius, 2)));
    }
}
