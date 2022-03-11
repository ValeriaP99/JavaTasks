package md.pentalog.tasks_part1.chapter6;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        int n1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side of square --> ");
        n1 = scanner.nextInt();

        for(int i = 0; i < n1; i++){
            System.out.print("*  ");
        }
        System.out.println();
        for(int j = 0; j < n1-2; j++){
            System.out.print("*  ");
            for(int k = 0; k < n1-2; k++){
                System.out.print("*  ");
            }
            System.out.println("*");
        }
        for(int i = 0; i < n1; i++){
            System.out.print("*  ");
        }
    }
}
