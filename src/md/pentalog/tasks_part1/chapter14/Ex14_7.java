package md.pentalog.tasks_part1.chapter14;

// Pig Latin

import java.util.Scanner;

public class Ex14_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence;
        System.out.print("Enter a sentence --> ");
        sentence = scanner.nextLine();

        System.out.println("---------[ Coded sentence ]---------");
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++){
            printLatinWord(words[i]);
        }
        System.out.println();
    }

    public static void printLatinWord(String word){
        String firstWord = String.valueOf(word.charAt(0));
        String lastWords = word.substring(1);
        String format = lastWords + firstWord + "ay";
        System.out.print(format+" ");
    }
}
