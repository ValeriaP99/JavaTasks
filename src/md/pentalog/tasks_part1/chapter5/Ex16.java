package md.pentalog.tasks_part1.chapter5;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        Scanner scanner = new Scanner(System.in);
        int n;
        int i=0;

        System.out.println("Enter five numbers between 1 and 30");
        do{
            System.out.print((i+1)+". ");
            n = scanner.nextInt();
            if(n > 0 && n <= 30){
                intArray[i] = n;
                i += 1;
            }else{
                System.out.println("Enter five numbers between 1 and 30!!!");
            }
        }while (i < intArray.length);

        System.out.println();
        showBarChart(intArray);

    }

    public static void showBarChart(int[] array){
        System.out.println("------------------------[ Bar chart ]------------------------");
        for (int i = 0; i < array.length; i++){
            System.out.printf("| %-2d | ", array[i]);
            for (int j = 0; j < array[i]; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------");
    }
}
