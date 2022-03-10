package md.pentalog.tasks_part1.chapter5;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        int n;
        int no;
        int smallest = Integer.MAX_VALUE;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of digits --> ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print((i+1)+". = ");
            no = scanner.nextInt();
            if(no < smallest){
                smallest = no;
            }
        }
        System.out.printf("%nThe smallest number --> %d", smallest);
    }
}
