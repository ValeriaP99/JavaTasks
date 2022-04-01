package md.pentalog.tasks_part1.chapter14.Ex22;

import java.util.Scanner;

public class EnglishLettersToMorseCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        System.out.print("Enter a text --> ");
        text = scanner.nextLine();

        String textToUpperCase = text.toUpperCase();

        String[] words = textToUpperCase.split(" ");
        for(int i = 0; i < words.length; i++){
            char[] listOfChar = words[i].toCharArray();
            for(int j = 0; j < listOfChar.length; j++){
                System.out.print(encodeLetterMorseCode(listOfChar[j])+" ");
            }
            System.out.print("   ");
        }
    }

    public static String encodeLetterMorseCode(char letter){
        String morseCode = "";
        switch (letter){
            case 'A' :
                morseCode = ".=";
                break;
            case 'B' :
                morseCode = "-...";
                break;
            case 'C' :
                morseCode = "-.-.";
                break;
            case 'D' :
                morseCode = "-..";
                break;
            case 'E' :
                morseCode = ".";
                break;
            case 'F' :
                morseCode = "..-.";
                break;
            case 'G' :
                morseCode = "--.";
                break;
            case 'H' :
                morseCode = "....";
                break;
            case 'I' :
                morseCode = "..";
                break;
            case 'J' :
                morseCode = ".---";
                break;
            case 'K' :
                morseCode = "-.-";
                break;
            case 'L' :
                morseCode = ".-..";
                break;
            case 'M' :
                morseCode = "--";
                break;
            case 'N' :
                morseCode = "-.";
                break;
            case 'O' :
                morseCode = "---";
                break;
            case 'P' :
                morseCode = ".--.";
                break;
            case 'Q' :
                morseCode = "--.-";
                break;
            case 'R' :
                morseCode = ".-.";
                break;
            case 'S' :
                morseCode = "...";
                break;
            case 'T' :
                morseCode = "-";
                break;
            case 'U' :
                morseCode = "..-";
                break;
            case 'V' :
                morseCode = "...-";
                break;
            case 'W' :
                morseCode = ".--";
                break;
            case 'X' :
                morseCode = "-..-";
                break;
            case 'Y' :
                morseCode = "-.--";
                break;
            case 'Z' :
                morseCode = "--..";
                break;
            case '1' :
                morseCode = ".----";
                break;
            case '2' :
                morseCode = "..---";
                break;
            case '3' :
                morseCode = "...--";
                break;
            case '4' :
                morseCode = "....-";
                break;
            case '5' :
                morseCode = ".....";
                break;
            case '6' :
                morseCode = "-....";
                break;
            case '7' :
                morseCode = "--...";
                break;
            case '8' :
                morseCode = "---..";
                break;
            case '9' :
                morseCode = "----.";
                break;
            case '0' :
                morseCode = "-----";
                break;
        }

        return morseCode;
    }
}
