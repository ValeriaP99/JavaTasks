package md.pentalog.tasks_part1.chapter4;

public class Ex32 {
    public static void main(String[] args) {

        for(int j = 1; j <= 8; j++){

            if(j % 2 != 0){
                for(int i = 1; i <= 8; i++) {
                    System.out.print("* ");
                    System.out.print(" ");
                }
            }

            if(j % 2 == 0){
                System.out.print(" ");
                for(int k = 1; k <= 8; k++){
                    System.out.print("* ");
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
