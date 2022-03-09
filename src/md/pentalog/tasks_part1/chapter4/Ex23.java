package md.pentalog.tasks_part1.chapter4;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        int counter;
        int number;
        int largest = 0;
        int largest2 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 digits (with enter tab)");
        for (counter = 0; counter < 10; counter++){
            System.out.print((counter+1)+". ");
            number = scanner.nextInt();

            if(number > largest){
                largest2 = largest;
                largest = number;
            }else if(number < largest && number > largest2){
                largest2 = number;
            }
        }

        System.out.printf("The largest numbers --> %d | %d", largest, largest2);
    }
}
