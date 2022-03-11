package md.pentalog.tasks_part1.chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ex30 {public static void main(String[] args) {
    SecureRandom random = new SecureRandom();
    int c;
    int rand;
    int num;

    Scanner scanner = new Scanner(System.in);

    System.out.println("-----------------------");
    System.out.println("|   Start   |   Quit   |");
    System.out.println("-----------------------");
    System.out.println("|     1     |     2    |");
    System.out.println("-----------------------");
    System.out.print("Your choice: ");
    c = scanner.nextInt();

    while (c == 1){
        System.out.print("Enter a number ");
        num =  scanner.nextInt();
        rand = random.nextInt(1000);
        //System.out.println("Random number  = "+rand);

        while(num != rand){
            if(num > rand){
                System.out.println("Too high");
                System.out.print("Enter a number ");
                num =  scanner.nextInt();
            }else if(num < rand){
                System.out.println("Too low");
                System.out.print("Enter a number ");
                num =  scanner.nextInt();
            }
        }
        System.out.println("********[ BINGO ]********");

        System.out.println("-----------------------");
        System.out.println("|   Start   |   Quit   |");
        System.out.println("-----------------------");
        System.out.println("|     1     |     2    |");
        System.out.println("-----------------------");
        System.out.print("Your choice: ");
        c = scanner.nextInt();
    }

}
}
