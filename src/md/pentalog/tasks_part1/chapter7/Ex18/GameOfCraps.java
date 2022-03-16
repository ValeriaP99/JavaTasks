package md.pentalog.tasks_part1.chapter7.Ex18;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GameOfCraps {
    private enum RollOfDice {
        SNAKE_ACE, ACE_DEUCE, EASY_FOUR, FIVE, EASY_SIX, SEVEN_OUT, HARD_FOUR, EASY_EIGHT, HARD_SIX,
        NINE, HARD_EIGHT, EASY_TEN, HARD_TEN, YO_LEVEN, BOXCARS
    }

    ;

    private enum STATUS {WON, LOST, CONTINUE}

    ;
    private Random randomNumbers = new Random();
    private int totalWin = 0;
    private int totalLost = 0;
    private int counter = 0;
    private int[] arrayWon = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private int[] arrayLost = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    Map<String, int[]> mapWithResult = new HashMap<>();

    public Map<String, int[]> runCraps() {
        counter = 0;

        int[] array = getSum();
        RollOfDice rollOfDice = getRollOfDice(array[0], array[1], array[2]);
        STATUS status = null;
        int sum = array[2];
        int start = 0;

        //System.out.println("Sum = "+sum);
        if (rollOfDice == RollOfDice.SEVEN_OUT || rollOfDice == RollOfDice.YO_LEVEN) {
            status = STATUS.WON;
            /*System.out.println("Roll of dice: "+rollOfDice);
            System.out.println("Status = "+status+"\n");*/
            totalWin += 1;
            arrayWon[0] += 1;
        } else if (rollOfDice == RollOfDice.SNAKE_ACE || rollOfDice == RollOfDice.ACE_DEUCE || rollOfDice == RollOfDice.BOXCARS) {
            status = STATUS.LOST;
            /*System.out.println("Roll of dice: "+rollOfDice);
            System.out.println("Status = "+status+"\n");*/
            totalLost += 1;
            arrayLost[0] += 1;
            System.exit(0);

        } else {
            //System.out.println("Roll of dice: "+rollOfDice);
            status = STATUS.CONTINUE;
            counter += 1;
            /*System.out.println("Roll of dice: "+rollOfDice);
            System.out.println("Status = "+status+"\n")*/
            ;
            start = sum;
        }


        while (status == STATUS.CONTINUE) {
            int[] array2 = getSum();
            int sum2 = array2[2];
            RollOfDice rollOfDice2 = getRollOfDice(array2[0], array2[1], array2[2]);
            //System.out.println("Sum = "+sum2);
            if (sum2 == start) {
                status = STATUS.WON;
                /*System.out.println("Roll of dice: "+rollOfDice2);
                System.out.println("Status = "+status+"\n");*/
                totalWin += 1;
                arrayWon[counter] += 1;
            } else if (sum2 == 7) {
                status = STATUS.LOST;
                /*System.out.println("Roll of dice: "+rollOfDice2);
                System.out.println("Status = "+status+"\n");*/
                totalLost += 1;
                arrayLost[counter] += 1;
            } else {
                start = sum2;
                status = STATUS.CONTINUE;
                counter += 1;
                /*System.out.println("Roll of dice: "+rollOfDice2);
                System.out.println("Status = "+status+"\n");*/
            }
        }

        mapWithResult.put("winnerMap", arrayWon);
        mapWithResult.put("lostMap", arrayLost);
        return mapWithResult;
    }

    public int[] getSum() {
        int num1 = randomNumbers.nextInt(1, 7);
        int num2 = randomNumbers.nextInt(1, 7);
        int[] sum = new int[3];
        sum[0] = num1;
        sum[1] = num2;
        sum[2] = num1 + num2;

        return sum;
    }

    public RollOfDice getRollOfDice(int num1, int num2, int sum) {
        RollOfDice rollOfDice = null;
        switch (sum) {
            case 2:
                rollOfDice = RollOfDice.SNAKE_ACE;
                break;
            case 3:
                rollOfDice = RollOfDice.ACE_DEUCE;
                break;
            case 4:
                if (num1 == 2 && num2 == 2) {
                    rollOfDice = RollOfDice.HARD_FOUR;
                } else {
                    rollOfDice = RollOfDice.EASY_FOUR;
                }
                break;
            case 5:
                rollOfDice = RollOfDice.FIVE;
                break;
            case 6:
                if (num1 == 3 && num2 == 3) {
                    rollOfDice = RollOfDice.HARD_SIX;
                } else {
                    rollOfDice = RollOfDice.EASY_SIX;
                }
                break;
            case 7:
                rollOfDice = RollOfDice.SEVEN_OUT;
                break;
            case 8:
                if (num1 == 4 && num2 == 4) {
                    rollOfDice = RollOfDice.HARD_EIGHT;
                } else {
                    rollOfDice = RollOfDice.EASY_EIGHT;
                }
                break;
            case 9:
                rollOfDice = RollOfDice.NINE;
                break;
            case 10:
                if (num1 == 5 && num2 == 5) {
                    rollOfDice = RollOfDice.HARD_TEN;
                } else {
                    rollOfDice = RollOfDice.EASY_TEN;
                }
                break;
            case 11:
                rollOfDice = RollOfDice.YO_LEVEN;
                break;
            case 12:
                rollOfDice = RollOfDice.BOXCARS;
                break;
        }
        return rollOfDice;
    }
}
