package md.pentalog.tasks_part1.chapter15.Ex15_8;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class WriteFile {

    private static Formatter output;

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }

    public static void openFile(){
        try {
            output = new Formatter("src/md/pentalog/tasks_part1/chapter15/files/numbers.txt");
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
        System.out.printf("%s%s%n? ", "Enter response number [1-5]",
                "Enter end-of-file indicator to end input");
        for (int i = 0; i < 20; i++){
            try{
                output.format("%d%n", input.nextInt());
            }catch (FormatterClosedException e){
                System.err.println("Error writing to file");
                break;
            }catch (NoSuchElementException e){
                System.err.println("Invalid input. Please try again");
                input.nextLine();
            }
            System.out.print("? ");
        }
    }

    public static void closeFile(){
        if(output != null){
            output.close();
        }
    }

}
