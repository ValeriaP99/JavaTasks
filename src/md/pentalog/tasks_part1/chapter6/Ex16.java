package md.pentalog.tasks_part1.chapter6;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int num1;
        int num2;
        String yesOrNo;
        boolean multiple;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want add some information (yes -> y and no -> n)? ---> ");
        yesOrNo = scanner.next();
        System.out.println("Enter two numbers ");

        while (yesOrNo.equals("y")){
            System.out.print("num1 = ");
            num1 = scanner.nextInt();
            System.out.print("num2 = ");
            num2 = scanner.nextInt();

            multiple = isMultiple(num1, num2);
            if(multiple == true){
                System.out.printf("The second number(%d) IS a multiple of a first number(%d)%n", num2, num2);
            }else {
                System.out.printf("The second number(%d) ISN'T a multiple of a first number(%d)%n", num2, num2);
            }

            System.out.print("\nContinue (yes -> y and no -> n)? ---> ");
            yesOrNo = scanner.next();
            System.out.println();
        }

    }

    public static boolean isMultiple(int num1, int num2){
        boolean multiple = false;
        if(num1 % num2 == 0){
            multiple = true;
        }
        return multiple;
    }
}
