package md.pentalog.tasks_part1.chapter2;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number --> ");
        number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.printf("%d is even", number);
        }else{
            System.out.printf("%d is odd", number);
        }
    }
}
