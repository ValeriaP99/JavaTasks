package md.pentalog.tasks_part1.chapter5;

import md.pentalog.tasks_part1.chapter4.Ex37;

public class Ex13 {
    public static void main(String[] args) {
        System.out.println("Table of factorial for number between 1 and 20");

        System.out.println("----------------------------");
        System.out.printf("|%-5s|%-20s|%n", "N", "N!");
        System.out.println("----------------------------");
        for (int i = 1; i <= 20; i++){
            System.out.printf("|%-5d|%-20d|%n", i, getFactorial(i));
        }
        System.out.println("----------------------------");

    }

    public static long getFactorial(int n){
        long factorial = 1;
        for(int i = n; i >= n; i--){
            for(int j = 0; j < n; j++){
                factorial *= (n-j);
            }
        }
        return factorial;
    }
}
