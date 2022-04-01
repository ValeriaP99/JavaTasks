package md.pentalog.tasks_part1.chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex14_11 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String text;
        char charI;

        System.out.println("Enter a line a line of text");
        text = scanner.nextLine();
        System.out.print("Enter a search character -> ");
        charI = scanner.next().charAt(0);

        int count = 0;
        int index = 0;

        while(index != -1){
            index = text.indexOf(charI, index);
            if(index != -1){
                count += 1;
            }
            System.out.println("Letter "+charI+" is located at index "+(index));
        }

        System.out.println("Count = "+count);
    }
}
