package md.pentalog.tasks_part1.chapter6;

public class Ex21 {
    public static void main(String[] args) {
        System.out.println("-----[ Display digits ]--------");
        displayDigits(3456);
    }

    public static int calculateIntegerPart(int a, int b){
        return a/b;
    }

    public static int calculateRemainder(int a, int b){
        return a%b;
    }

    public static int countLength(int n){
        int counter = 0;
        while (n != 0){
            n = calculateIntegerPart(n, 10);
            counter += 1;
        }
        return counter;
    }

    public static void displayDigits(int n){
        int length = countLength(n);
        int ten;
        int num;
        ten = (int) Math.pow(10, (length-1));
        while (n != 0){
            num = calculateIntegerPart(n, ten);
            n = calculateRemainder(n, ten);
            System.out.print(num+"  ");
            ten /= 10;
        }
    }
}
