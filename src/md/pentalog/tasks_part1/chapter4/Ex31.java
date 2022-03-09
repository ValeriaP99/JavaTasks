package md.pentalog.tasks_part1.chapter4;

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        int binaryNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number --> ");
        binaryNumber = scanner.nextInt();

        System.out.print("Convert to decimal number --> ");
        int decimal = convertToDecimal(binaryNumber);
        System.out.println(decimal);

    }

    public static int convertToDecimal(int binaryNum){
        int decimalNum=0;
        int i = 0;

        while (binaryNum != 0){
            int remainder =  binaryNum % 10;
            decimalNum += remainder * Math.pow(2,i);
            binaryNum /= 10;
            i += 1;
        }

        return decimalNum;
    }
}
