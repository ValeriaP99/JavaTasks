package md.pentalog.tasks_part1.chapter15.Ex15_8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadFile {
    private static Scanner input;
    private static PrintStream output;

    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();
    }

    public static void openFile(){
        try{
            input = new Scanner(Paths.get("src/md/pentalog/tasks_part1/chapter15/files/numbers.txt"));
        }catch (IOException ioException){
            System.err.println("Error opening file");
            System.exit(1);
        }
    }

    public static void readRecords(){
        System.out.printf("%-10s", "Numbers: ");
        int[] numbers = new int[20];
        int i = 0;
        try{

            while (input.hasNext()){
                int number = input.nextInt();
                System.out.printf("%d | ", number);
                numbers[i] = number;
                i += 1;
            }
            ///////////////////////////
            showFrequency(numbers);
            ////////////////////////////
        }catch (NoSuchElementException e){
            System.err.println("File improperly formed");
        }catch (IllegalStateException e){
            System.err.println("Error reading from file");
        }
    }

    public static void closeFile(){
        if(input != null){
            input.close();
        }
    }

    public static void showFrequency(int[] response){
        try {
            output = new PrintStream("src/md/pentalog/tasks_part1/chapter15/files/output.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int[] frequency = new int[6];

        for(int answer = 0; answer < response.length; answer++){
            try{
                ++frequency[response[answer]];
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf(" responses[%d] = %d%n%n", answer, response[answer]);
            }
        }
        output.println("-----------------------");
        output.printf("|%10s|%10s|%n", "Rating", "Frequency");
        output.println("-----------------------");
        for(int rating = 1; rating < frequency.length; rating++){
            output.printf("|%10d|%10d|%n", rating, frequency[rating]);
        }
        output.println("-----------------------\n\n");
    }
}
