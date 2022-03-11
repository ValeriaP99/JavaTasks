package md.pentalog.tasks_part1.chapter6;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        int num;
        String yesOrNo;
        boolean isEven;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want add some information (yes -> y and no -> n)? ---> ");
        yesOrNo = scanner.next();
        System.out.println("Enter a number ");

        while (yesOrNo.equals("y")){
            System.out.print("number = ");
            num = scanner.nextInt();


            isEven = isEven(num);
            if(isEven == true){
                System.out.printf("The number %d is even%n", num);
            }else {
                System.out.printf("The number %d is odd%n", num);
            }

            System.out.print("\nContinue (yes -> y and no -> n)? ---> ");
            yesOrNo = scanner.next();
            System.out.println();
        }
    }

    public static boolean isEven(int num){
        boolean isEven = false;
        if(num % 2 == 0){
            isEven = true;
        }
        return isEven;
    }
}
