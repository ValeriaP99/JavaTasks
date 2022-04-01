package md.pentalog.tasks_part1.chapter14.Ex22;

import java.util.Scanner;

public class MorseCodeToEnglishLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        System.out.print("Enter Morse Code --> ");
        text = scanner.nextLine();

        String[] words = text.split("   ");
        for(int i = 0; i < words.length; i++){
            String[] letters = words[i].split(" ");
            for (int j = 0; j < letters.length; j++){
                char decodeLetter = decodeLetterMorseCode(letters[j]);
                System.out.print(decodeLetter);
            }
            System.out.print(" ");
        }
    }

    public static char decodeLetterMorseCode(String morseCode){
        char letter = ' ';
        switch (morseCode){
            case ".=" :
                letter = 'A';
                break;
            case "-..." :
                letter = 'B';
                break;
            case "-.-." :
                letter = 'C';
                break;
            case "-.." :
                letter = 'D';
                break;
            case "." :
                letter = 'E';
                break;
            case "..-." :
                letter = 'F';
                break;
            case "--." :
                letter = 'G';
                break;
            case "...." :
                letter = 'H';
                break;
            case ".." :
                letter = 'I';
                break;
            case ".---" :
                letter = 'J';
                break;
            case "-.-" :
                letter = 'K';
                break;
            case ".-.." :
                letter = 'L';
                break;
            case "--" :
                letter = 'M';
                break;
            case "-." :
                letter = 'N';
                break;
            case "---" :
                letter = 'O';
                break;
            case ".--." :
                letter = 'P';
                break;
            case "--.-" :
                letter = 'Q';
                break;
            case ".-." :
                letter = 'R';
                break;
            case "..." :
                letter = 'S';
                break;
            case "-" :
                letter = 'T';
                break;
            case "..-" :
                letter = 'U';
                break;
            case "...-" :
                letter = 'V';
                break;
            case ".--" :
                letter = 'W';
                break;
            case "-..-" :
                letter = 'X';
                break;
            case "-.--" :
                letter = 'Y';
                break;
            case "--.." :
                letter = 'Z';
                break;
            case ".----" :
                letter = '1';
                break;
            case "..---" :
                letter = '2';
                break;
            case "...--" :
                letter = '3';
                break;
            case "....-" :
                letter = '4';
                break;
            case "....." :
                letter = '5';
                break;
            case "-...." :
                letter = '6';
                break;
            case "--..." :
                letter = '7';
                break;
            case "---.." :
                letter = '8';
                break;
            case "----." :
                letter = '9';
                break;
            case "-----" :
                letter = '0';
                break;
        }
        return letter;
    }
}
