package md.pentalog.tasks_part1.chapter16;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex16_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;

        System.out.println("Enter a line of text");
        text = scanner.nextLine();

        String[] words = text.split(" ");
        Set<String> strings = new TreeSet<>();

        for(String word : words){
            strings.add(word);
        }
        System.out.println("List of words in ascending order");
        for(String string : strings){
            System.out.printf("%s | ", string);
        }
    }
}
