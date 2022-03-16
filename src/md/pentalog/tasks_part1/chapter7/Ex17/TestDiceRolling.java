package md.pentalog.tasks_part1.chapter7.Ex17;

public class TestDiceRolling {
    public static void main(String[] args) {
        DiceRolling diceRolling = new DiceRolling();
        int[] array = diceRolling.rollDice();
        showSum(array);

        //Verification
        /*System.out.println();
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("Total sum = "+sum);*/
    }

    public static void showSum(int[] array){
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|%n", "sum = 2",
                "sum = 3", "sum = 4", "sum = 5", "sum = 6", "sum = 7", "sum = 8", "sum = 9", "sum = 10",
                "sum = 11", "sum = 12");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
        for(int i = 0; i < array.length; i++){
            System.out.printf("|%-10d", array[i]);
        }
        System.out.print("|");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------");
    }
}
