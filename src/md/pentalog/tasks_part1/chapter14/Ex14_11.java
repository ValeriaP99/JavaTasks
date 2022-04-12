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
        boolean bool = true;
        int index = 0;

        while(bool){

            int index2 = text.indexOf(charI, index);
            //text = text.substring(index);

            if(index2 != -1){
                bool = true;
                count += 1;
                System.out.println("Letter "+charI+" is located at index "+(index2));
                index = index2+1;
            }else{
                bool = false;
            }
        }

        System.out.println("Count = "+count);
    }
}
