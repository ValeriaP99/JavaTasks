package md.pentalog.tasks_part1.chapter2;

public class Ex31 {
    public static void main(String[] args) {
        System.out.println("---[ Table of squares and cubes ]---");
        System.out.println("------------------------------------");
        System.out.printf("|%10s|%10s|%10s  |%n", "Number", "Square", "Cube");
        System.out.println("------------------------------------");
        for(int i = 0; i <= 10; i++){
            System.out.printf("|%10s|%10s|%10s  |%n", i, Math.pow(i, 2), Math.pow(i, 3));
        }
        System.out.println("------------------------------------");
    }
}
