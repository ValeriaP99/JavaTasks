package md.pentalog.tasks_part1.chapter7.Ex17;

import java.util.Random;

public class DiceRolling {
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SIX = 6;
    private static final int SEVEN = 7;
    private static final int EIGHT = 8;
    private static final int NINE = 9;
    private static final int TEN = 10;
    private static final int ELEVEN = 11;
    private static final int TWELVE = 12;
    private Random randomNumbers = new Random();

    public int[] rollDice(){
        int sum = 0;
        int totalTwo = 0;
        int totalThree = 0;
        int totalFour = 0;
        int totalFive = 0;
        int totalSix = 0;
        int totalSeven = 0;
        int totalEight = 0;
        int totalNine = 0;
        int totalTen = 0;
        int totalEleven = 0;
        int totalTwelve = 0;

        for(int i = 0; i < 36000000; i++){
            sum = 0;
            int firstDice = randomNumbers.nextInt(1, 7);
            int secondDice = randomNumbers.nextInt(1, 7);
            sum =  firstDice + secondDice;

            //System.out.println("sum = "+sum);

            switch (sum){
                case TWO :
                    totalTwo += 1;
                    break;
                case THREE:
                    totalThree += 1;
                    break;
                case FOUR:
                    totalFour += 1;
                    break;
                case FIVE:
                    totalFive += 1;
                    break;
                case SIX:
                    totalSix += 1;
                    break;
                case SEVEN:
                    totalSeven += 1;
                    break;
                case EIGHT:
                    totalEight += 1;
                    break;
                case NINE:
                    totalNine += 1;
                    break;
                case TEN:
                    totalTen += 1;
                    break;
                case ELEVEN:
                    totalEleven += 1;
                    break;
                case TWELVE:
                    totalTwelve += 1;
                    break;
            }
        }

        int[] intArray= {totalTwo, totalThree, totalFour, totalFive, totalSix, totalSeven, totalEight, totalNine, totalTen,
                totalEleven, totalTwelve};
        return intArray;
    }
}
