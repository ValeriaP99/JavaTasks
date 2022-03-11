package md.pentalog.tasks_part1.chapter6;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        int n1;
        char fillCharacter;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side of square --> ");
        n1 = scanner.nextInt();
        System.out.print("Enter the fill character --> ");
        fillCharacter = scanner.next().charAt(0);

        for(int i = 0; i < n1; i++){
            System.out.printf("%c  ", fillCharacter);
        }
        System.out.println();
        for(int j = 0; j < n1-2; j++){
            System.out.print("*  ");
            for(int k = 0; k < n1-2; k++){
                System.out.printf("%c  ", fillCharacter);
            }
            System.out.printf("%c%n", fillCharacter);
        }
        for(int i = 0; i < n1; i++){
            System.out.printf("%c  ", fillCharacter);
        }
    }
}
