package md.pentalog.tasks_part1.chapter2;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        int n1;
        int n2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integers");
        System.out.print("int-1 = ");
        n1 = scanner.nextInt();
        System.out.print("int-2 = ");
        n2 = scanner.nextInt();

        System.out.println(n1+" + "+n2+" = "+(n1+n2));
        System.out.println(n1+" * "+n2+" = "+(n1*n2));
        System.out.println(n1+" - "+n2+" = "+(n1-n2));
        System.out.println(n1+" / "+n2+" = "+((double)n1/n2));

    }
}
