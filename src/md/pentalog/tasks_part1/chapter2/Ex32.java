package md.pentalog.tasks_part1.chapter2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        int negative = 0;
        int positive = 0;
        int zero = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five digits with enter tab");
        for(int i = 0; i < intArray.length; i++){
            System.out.print((i+1)+". = ");
            intArray[i] = scanner.nextInt();
        }

        for (int j = 0; j < intArray.length; j++) {
            if (intArray[j] < 0) {
                negative++;
            } else if (intArray[j] > 0) {
                positive++;
            } else if (intArray[j] == 0) {
                zero++;
            }
        }

        System.out.println("Negative numbers = "+negative);
        System.out.println("Positive numbers = "+positive);
        System.out.println("Zero numbers = "+zero);
    }
}
