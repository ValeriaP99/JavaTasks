package md.pentalog.tasks_part1.chapter2;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        int number;
        int clone;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a five digit number --> ");
        number = scanner.nextInt();
        clone = number;

        while (clone != 0){
            clone /= 10;
            i++;
        }
        if(i < 5){
            System.out.println("The number is short, enter a five-digit number");
        }else if(i > 5){
            System.out.println("The number is long, enter a five-digit number");
        } else {
            int d1 = number / 10000;
            number %= 10000;
            int d2 = number / 1000;
            number %= 1000;
            int d3 = number / 100;
            number %= 100;
            int d4 = number / 10;
            number %= 10;
            int d5 = number;

            System.out.println(d1+"   "+d2+"   "+d3+"   "+d4+"   "+d5);
        }
    }
}