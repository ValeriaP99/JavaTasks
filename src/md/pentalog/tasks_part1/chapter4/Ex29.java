package md.pentalog.tasks_part1.chapter4;

import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side of square --> ");
        n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int j = 0; j < n-2; j++){
            System.out.print("*");
            for(int k = 0; k < n; k++){
                System.out.print("");
            }
            System.out.println("*");
        }
        for(int i = 0; i < n; i++){
            System.out.print("* ");
        }
    }
}
