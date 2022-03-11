package md.pentalog.tasks_part1.chapter6;

public class Ex21 {
    public static void main(String[] args) {
        System.out.println("-----[ Display digits ]--------");
        displayDigits(3456);

        int n = 10;
        for (int i = 0; i < 4; i++){
            n *= 10;
        }
        System.out.println(n);

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
        int ten = 10;
        int num;



        /*while (n != 0){
            ten = (ten*length)/length;
            num = calculateIntegerPart(n, ten);
            n = calculateRemainder(n, ten);
            System.out.print(num+"  ");
            ten /= 10;
            //length -= 1;
        }*/
    }
}
