package md.pentalog.tasks_part1.chapter7;

//Duplicate Elimination

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        int num;
        int i = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five number between 10 and 100");

        while(i < intArray.length){
            System.out.printf("%d. = ", (i+1));
            num = scanner.nextInt();
            int k = 0;
            boolean isDuplicate = false;

            if(num >= 10 && num <= 100){

                while(intArray[k] != 0){
                    if (num == intArray[k]){
                        isDuplicate = true;
                    }
                    k += 1;
                }

                if(isDuplicate == true){
                    System.out.println("This number is duplicate enter other");
                }else if(isDuplicate == false){
                    intArray[i] = num;
                    i += 1;
                }
            }else{
                System.out.println("Enter a number between 10 and 100");
            }
        }

        System.out.print("\n\nArray introduced : ");
        for(int j = 0; j < intArray.length; j++){
            System.out.print(intArray[j]+" ");
        }

    }


}
