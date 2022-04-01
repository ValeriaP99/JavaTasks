package md.pentalog.tasks_part1.chapter16;

import java.util.*;

public class Ex16_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence and press Enter");
        String sentence = scanner.nextLine();
        sentence = sentence.toLowerCase();

        String[] words = sentence.split(" ");
        List<String> listOfWords = Arrays.asList(words);
        int count;
        for(int i = 0; i < words.length; i++){
            count = 1;
            String word = words[i];
            for(int j = i+1; j < words.length; j++){
                if(word.equals(words[j])){
                    count++;
                    words[j] = "0";
                }
            }
            if (count > 1 && words[i] != "0") {
                System.out.println(words[i]+" -- "+count);
            }
        }

    }
}
