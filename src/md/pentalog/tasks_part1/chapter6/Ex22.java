package md.pentalog.tasks_part1.chapter6;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        getCelsiusOrFahrenheit();
    }

    public static double celsius(double fahrenheit){
        return (5.0/9.0) * (fahrenheit - 32);
    }

    public static double fahrenheit(double celsius){
        return (9.0/5.0) * celsius + 32;
    }

    public static double getCelsiusOrFahrenheit(){
        char ch;
        double celsius;
        double fahrenheit;
        double temperature = 0.0;
        Scanner scanner = new Scanner(System.in);


        String yesOrNo;

        System.out.print("Do you want add some information (yes -> y and no -> n)? ---> ");
        yesOrNo = scanner.next();

        while (yesOrNo.equals("y")){
            System.out.print("Enter the f for Fahrenheit and c for Celsius: ");
            ch = scanner.next().charAt(0);

            switch (ch){
                case 'f':
                    System.out.print("Enter the celsius --> ");
                    celsius = scanner.nextDouble();
                    temperature = fahrenheit(celsius);
                    System.out.printf("Convert to Fahrenheit --> %.2f%n", temperature);
                    break;
                case 'c':
                    System.out.print("Enter the fahrenheit --> ");
                    fahrenheit = scanner.nextDouble();
                    temperature = celsius(fahrenheit);
                    System.out.printf("Convert to Celsius --> %.2f%n", temperature);
                    break;
            }

            System.out.print("\nContinue (yes -> y and no -> n)? ---> ");
            yesOrNo = scanner.next();
            System.out.println();
        }

        return temperature;
    }
}
