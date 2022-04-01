package md.pentalog.tasks_part1.chapter14;

import java.util.Scanner;

public class Ex14_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a sentence and press Enter");
        String sentence = input.nextLine();

        String[] words = sentence.split(" ");
        System.out.println();
        System.out.println("-----[ Reversed sentence ]-----");

        for (int i = words.length - 1; i >= 0; i--){
            System.out.print(words[i]+" ");
        }

    }
}
