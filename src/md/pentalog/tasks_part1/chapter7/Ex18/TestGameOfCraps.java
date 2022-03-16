package md.pentalog.tasks_part1.chapter7.Ex18;

import java.util.HashMap;
import java.util.Map;

public class TestGameOfCraps {
    public static void main(String[] args) {
        GameOfCraps gameOfCraps = new GameOfCraps();

        Map<String, int[]> map = new HashMap<>();
        for(int k = 0; k < 10; k++){
            //System.out.println("----------------["+k+"]------------------");
            map = gameOfCraps.runCraps();
        }


        System.out.println();
        int[] arrW = map.get("winnerMap");
        int[] arrL = map.get("lostMap");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-5s|%-5s|%-5s|%-5s|%-5s|%-5s|%-5s|%-5s|%-5s|%-5s|%-5s|%-5s|%-5s|%-5s|%-5s|%-5s|%-5s|%-5s|%-5s|%-5s|%-5s|%-5s|%n",
                "Roll", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18",
                "19", "20", ">20");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-5s|", "Win");
        for(int i = 0; i < arrW.length; i++){
            System.out.printf("%-5d|", arrW[i]);
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-5s|", "Lost");
        for(int j = 0; j < arrL.length; j++){
            System.out.printf("%-5d|", arrL[j]);
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
    }
}
