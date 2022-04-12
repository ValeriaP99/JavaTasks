package md.pentalog.tasks_part1.chapter15;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.security.SecureRandom;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Ex15_7 {
    public static String[] TWO = {"A", "B", "C"};
    public static String[] THREE = {"D", "E", "F"};
    public static String[] FOUR = {"G", "H", "I"};
    public static String[] FIVE = {"J", "K", "L"};
    public static String[] SIX = {"M", "N", "O"};
    public static String[] SEVEN = {"P", "R", "S"};
    public static String[] EIGHT = {"T", "U", "V"};
    public static String[] NINE = {"W", "X", "Y"};

    private static PrintStream output;

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }

    public static void openFile(){
        try {
            output = new PrintStream("src/md/pentalog/tasks_part1/chapter15/files/telephone.txt");
        }catch (SecurityException e){
            System.err.println("Write permission denied");
            System.exit(1);
        }catch (FileNotFoundException e) {
            System.err.println("Error opening file");
            System.exit(1);
        }
    }

    public static void addRecords(){
        Scanner input = new Scanner(System.in);
        System.out.printf("%s", "Enter telephone number",
                "Enter end-of-file indicator to end input");
        try{
            String phone = input.next();
            if(phone.contains("0") || phone.contains("1")){
                throw new NumberFormatException("Phone number must contains number between 2 and 9");
            }
            output.printf("%s %s %n", "Phone : ", phone);
            output.println("Encode number:");
            for(int i = 0; i < 2187; i++){
                output.printf("%s ", encodeTelephoneNumber(phone));
                if(i != 0 && i % 10 == 0){
                    output.println();
                }
            }
        }catch (NoSuchElementException ex){
            System.err.println("Invalid input. Please try again");
        }
    }

    public static void closeFile(){
        if(output != null){
            output.close();
        }
    }

    public static String getLetter(String number){
        String letter = "";
        SecureRandom secureRandom = new SecureRandom();
        switch (number){
            case "2" :
                letter = TWO[secureRandom.nextInt(3)];
                break;
            case "3" :
                letter = THREE[secureRandom.nextInt(3)];
                break;
            case "4" :
                letter = FOUR[secureRandom.nextInt(3)];
                break;
            case "5" :
                letter = FIVE[secureRandom.nextInt(3)];
                break;
            case "6" :
                letter = SIX[secureRandom.nextInt(3)];
                break;
            case "7" :
                letter = SEVEN[secureRandom.nextInt(3)];
                break;
            case "8" :
                letter = EIGHT[secureRandom.nextInt(3)];
                break;
            case "9" :
                letter = NINE[secureRandom.nextInt(3)];
                break;
        }
        return  letter;
    }

    public static String encodeTelephoneNumber(String number){
        String tel = "";
        String[] telNumber = number.split("-");
        for(int i = 0; i < telNumber.length; i++){
            String[] part = telNumber[i].split("");
            for(int j = 0; j < part.length; j++){
                tel += getLetter(part[j]);
            }
        }
        return tel;
    }
}
