package md.pentalog.tasks_part1.chapter6;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number --> ");
        n = scanner.nextInt();
        System.out.print("Reversed number --> ");
        reversedNumber(n);
    }

    public static void reversedNumber(int n){
        int remainder;
        while (n != 0){
            remainder = n % 10;
            System.out.print(remainder);
            n /= 10;
        }
    }
}
