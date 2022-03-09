package md.pentalog.tasks_part1.chapter4;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        int number;
        int reverseNumber = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a five digits number --> ");
        number = scanner.nextInt();
        int num = number;
        int counter = 0;
        int remainder;

           // System.out.print("Enter a five digits number --> ");
            while(number != 0){
                remainder = number % 10;
                reverseNumber = reverseNumber * 10 + remainder;
                number /= 10;
                counter += 1;
            }

        System.out.println("Reversed number = "+reverseNumber+" and size = "+counter);
    }
}
