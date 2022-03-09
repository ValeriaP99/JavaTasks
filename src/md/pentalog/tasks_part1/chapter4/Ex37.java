package md.pentalog.tasks_part1.chapter4;

import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        int n;
        int factorial;
        double constantE;
        double constantEx;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative number --> ");
        n = scanner.nextInt();

        if(n != 0){
            System.out.printf("%d! = ", n);
            factorial = getFactorial(n);
            System.out.print(factorial);
            System.out.println();

            System.out.print("e = ");
            constantE = getConstantE(n);
            System.out.print(constantE);
            System.out.println();

            System.out.print("e^2 = ");
            constantEx = getConstantEX(n, 2);
            System.out.print(constantEx);

        }else{
            System.out.println("Enter a non-zero number");
        }
    }

    public static int getFactorial(int n){
        int factorial = 1;
        for(int i = n; i >= n; i--){
            for(int j = 0; j < n; j++){
                factorial *= (n-j);
            }
        }
        return factorial;
    }

    public static double getConstantE(int n){
        double constantE = 1.0;
        double fact;
        for(int i = 1; i <= n; i++){
            fact = 1/getFactorial(i);
            constantE += fact;
        }
        return constantE;
    }

    public static double getConstantEX(int n, int x){
        double ex = 1.0;
        int fact;
        for(int i = 1; i <= n; i++){
            fact = getFactorial(i);
            ex += (Math.pow(x, i)/fact);
        }
        return ex;
    }
}
