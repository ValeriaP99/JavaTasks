package md.pentalog.tasks_part1.chapter2;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int number1;
        int number2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        System.out.print("number1 = ");
        number1 = scanner.nextInt();
        System.out.print("number2 = ");
        number2 = scanner.nextInt();

        if(number1 == number2){
            System.out.println("These numbers are equal");
        }else if(number1 > number2){
            System.out.printf("%d is larger", number1);
        }else if(number1 < number2){
            System.out.printf("%d is larger", number2);
        }

    }
}
