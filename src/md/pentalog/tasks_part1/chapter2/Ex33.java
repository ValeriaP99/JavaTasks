package md.pentalog.tasks_part1.chapter2;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        double kg;
        double m;
        double bmi;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight in Kilograms and height in Meters");
        System.out.print("weight = ");
        kg = scanner.nextDouble();
        System.out.print("height = ");
        m = scanner.nextDouble();
        bmi = kg/(m*m);

        System.out.printf("%nYour BMI(body mass index) are %.2f%n%n", bmi);
        System.out.println("------[ BMI VALUES ]-----");
        System.out.println("Underweight: less than 18,5");
        System.out.println("Normal:      between 18,5 and 24,9");
        System.out.println("Overweight:  between 25 and 29,9");
        System.out.println("Obese:       30 or greater");
    }
}
