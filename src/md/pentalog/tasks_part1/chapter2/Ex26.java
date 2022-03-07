package md.pentalog.tasks_part1.chapter2;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        int number1;
        int number2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number");
        System.out.print("num1 = ");
        number1 = scanner.nextInt();
        System.out.print("num2 = ");
        number2 = scanner.nextInt();
        if(number2 % number1 == 0){
            System.out.printf("%d is a multiple of %d", number1, number2);
        }else{
            System.out.printf("%d isn't a multiple of %d", number1, number2);
        }
    }
}
