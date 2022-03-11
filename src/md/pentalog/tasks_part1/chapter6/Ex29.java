package md.pentalog.tasks_part1.chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Ex29 {
    public enum COIN{
        HEADS,
        TAILS
    }
    public static void main(String[] args) {
        int c;
        int headsCount = 0;
        int tailsCount = 0;
        COIN coin;
        int rand;
        SecureRandom random1 = new SecureRandom();
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------");
        System.out.println("| Toss coin |   Quit   |");
        System.out.println("-----------------------");
        System.out.println("|     1     |     2    |");
        System.out.println("-----------------------");
        System.out.print("Your choice: ");
        c = scanner.nextInt();

        while (c == 1){
            System.out.println();
            rand = random1.nextInt(1, 3);
            coin = flip(rand);
            System.out.println("Random number = "+rand+" face coin = "+coin);
            if(coin == COIN.HEADS){
                headsCount += 1;
            }else if(coin == COIN.TAILS){
                tailsCount += 1;
            }

            System.out.println("-----------------------");
            System.out.println("| Toss coin |   Quit   |");
            System.out.println("-----------------------");
            System.out.println("|     1     |     2    |");
            System.out.println("-----------------------");
            System.out.print("Your choice: ");
            c = scanner.nextInt();
            System.out.println();
        }

        System.out.println("--------[ Total ]--------");
        System.out.println("HEADS --> "+headsCount);
        System.out.println("TAILS --> "+tailsCount);
        System.out.println("-------------------------");
    }

    public static COIN flip(int faceCoin){
        COIN face = null;
        switch (faceCoin){
            case 1:
                face = COIN.HEADS;
                break;
            case 2:
                face = COIN.TAILS ;
        }
        return face;
    }
}
