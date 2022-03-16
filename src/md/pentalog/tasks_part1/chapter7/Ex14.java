package md.pentalog.tasks_part1.chapter7;

public class Ex14 {
    public static void main(String[] args) {
        System.out.printf("Product of 2 integers : %d (2, 4)%n", product(2, 4));
        System.out.printf("Product of 3 integers : %d (2, 4, 3)%n", product(2, 4, 3));
        System.out.printf("Product of 4 integers : %d (2, 4, 6, 1)%n", product(2, 4, 6, 1));
        System.out.printf("Product of 5 integers : %d (2, 4, 5, 7, 1)%n", product(2, 4, 4, 7, 1));
    }

    public static int product(int ... nums){
        int product = 1;
        for(int n : nums){
            product *= n;
        }
        return product;
    }
}
