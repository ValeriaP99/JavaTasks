package md.pentalog.tasks_part1.chapter4;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        int side1;
        int side2;
        int side3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sides of triangle");
        System.out.print("side 1: ");
        side1 = scanner.nextInt();
        System.out.print("side 2: ");
        side2 = scanner.nextInt();
        System.out.print("side 3: ");
        side3 = scanner.nextInt();

        if(side1 == 0 || side2 == 0 || side3 == 0){
            System.out.println("You enter a zero value");
        }else{
            if(Math.pow(side1, 2) == (Math.pow(side2, 2) + Math.pow(side3, 2))
                    || Math.pow(side2, 2) == (Math.pow(side3, 2) + Math.pow(side1, 2))
                    || Math.pow(side3, 2) == (Math.pow(side2, 2) + Math.pow(side1, 2))){
                System.out.println("Could represent the sides of a right triangle");
            }else{
                System.out.println("Could not represent the sides of a right triangle");
            }
        }
    }
}
