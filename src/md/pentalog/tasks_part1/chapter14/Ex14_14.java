package md.pentalog.tasks_part1.chapter14;

import java.util.Scanner;

public class Ex14_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of text");
        String text = scanner.nextLine();
        String[] words = text.split(" ");

        System.out.print("Words that end with ed --> ");
        for(String word : words){
            if(word.endsWith("ed")){
                System.out.print(word+" | ");
            }
        }
    }
}
