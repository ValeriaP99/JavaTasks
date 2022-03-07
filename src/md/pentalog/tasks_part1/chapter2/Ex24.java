package md.pentalog.tasks_part1.chapter2;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;

        System.out.println("Enter five integer");
        num1 = readData(num1, "num1");
        num2 = readData(num2, "num2");
        num3 = readData(num3, "num3");
        num4 = readData(num4, "num4");
        num5 = readData(num5, "num5");

        printLargest(num1, num2, num3, num4, num5);
        printLargest(num2, num1, num3, num4, num5);
        printLargest(num3, num2, num1, num4, num5);
        printLargest(num4, num2, num3, num1, num5);
        printLargest(num5, num2, num3, num1, num1);
    }

    public static int readData(int num, String name){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s = ", name);
        num = scanner.nextInt();
        return num;
    }

    public static void printLargest(int num1, int num2, int num3, int num4, int num5){
        if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
            System.out.printf("%d is largest%n", num1);
        }else if(num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5){
            System.out.printf("%d is smallest%n", num1);
        }
    }
}
