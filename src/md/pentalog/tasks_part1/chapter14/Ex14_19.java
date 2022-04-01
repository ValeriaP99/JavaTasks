package md.pentalog.tasks_part1.chapter14;

import md.pentalog.learn.UsefulMethods;

import java.util.Scanner;

public class Ex14_19 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String date;
        System.out.println("Enter a date with format 04/24/1995");
        date = scanner.nextLine();
        String[] dates = date.split("/");
        int month = Integer.parseInt(dates[0]);
        int day = Integer.parseInt(dates[1]);
        int year = Integer.parseInt(dates[2]);

        System.out.println(getFormatDate(month, day, year));
    }

    public static String getFormatDate(int month, int day, int year){
        return UsefulMethods.getMonth(month)+" "+day+", "+year;
    }
}
