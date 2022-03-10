package md.pentalog.tasks_part1.chapter5;

public class Ex12 {
    public static void main(String[] args) {
        int product = 1;

        System.out.println("The odd number between 1 and 15");
        for(int i = 1; i <= 15; i+=2){
            System.out.print(i+" | ");
            product *= i;
        }
        System.out.printf("%nProduct of odd number between 1 and 15 -> %d", product);
    }
}
