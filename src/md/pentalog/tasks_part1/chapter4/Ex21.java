package md.pentalog.tasks_part1.chapter4;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        int counter;
        int number;
        int largest = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 digits (with enter tab)");
        for (counter = 0; counter < 10; counter++){
            System.out.print((counter+1)+". ");
            number = scanner.nextInt();

            if(number > largest){
                largest = number;
            }
        }

        System.out.printf("The largest number --> %d", largest);
    }
}
