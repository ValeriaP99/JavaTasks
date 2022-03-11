package md.pentalog.tasks_part1.chapter6;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        double radius;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of a circle --> ");
        radius = scanner.nextDouble();
        double area = circleArea(radius);
        System.out.printf("Area of circle with radius %.2f = %.2f",radius ,area);
    }

    public static double circleArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
}
