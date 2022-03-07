package md.pentalog.tasks_part1.chapter2;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers");
        System.out.printf("number1 = ");
        num1 = scanner.nextInt();
        System.out.printf("number2 = ");
        num2 = scanner.nextInt();
        System.out.printf("number3 = ");
        num3 = scanner.nextInt();
        System.out.println();

        System.out.printf("The sum(%d + %d + %d) is = %d%n", num1, num2, num3, (num1+num2+num3));
        System.out.printf("The average((%d + %d + %d)/3) is = %d%n", num1, num2, num3, ((num1+num2+num3)/3));
        System.out.printf("The product(%d * %d * %d) is = %d%n", num1, num2, num3, (num1*num2*num3));

        if(num1 > num2 && num1 > num3){
            System.out.printf("%d is largest", num1);
        }else if(num2 > num1 && num1 > num3){
            System.out.printf("%d is largest", num2);
        }else if(num3 > num2 && num3 > num1){
            System.out.printf("%d is largest", num3);
        }
        System.out.println();
        if(num1 < num2 && num1 < num3){
            System.out.printf("%d is smallest", num1);
        }else if(num2 < num1 && num2 < num3){
            System.out.printf("%d is smallest", num2);
        }else if(num3 < num2 && num3 < num1){
            System.out.printf("%d is smallest", num3);
        }

    }
}
