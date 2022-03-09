package md.pentalog.tasks_part1.chapter4;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int passes = 0;
         int failures = 0;
         int studentCounter = 1;

         while(studentCounter <= 10){
             System.out.print("Enter the result (1 =  pass; 2 =  fail): ");
             int result = scanner.nextInt();

             if (result == 1 || result == 2){
                 if(result == 1){
                     passes = passes + 1;
                 }else{
                     failures = failures + 1;
                 }
                 studentCounter += 1;
             }else{
                 System.out.println("Enter 1 for pass or 2 for fail!!!");
             }
         }

        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

         if(passes > 8){
             System.out.println("Bonus to instructor!");
         }
    }
}
