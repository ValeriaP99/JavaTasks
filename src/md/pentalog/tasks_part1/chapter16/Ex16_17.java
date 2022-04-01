package md.pentalog.tasks_part1.chapter16;

import java.security.SecureRandom;
import java.util.*;

public class Ex16_17 {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = new LinkedList<>();
        SecureRandom secureRandom = new SecureRandom();

        for(int i = 0; i < 25; i++){
            listOfIntegers.add(secureRandom.nextInt(100));
        }

        printListInAscOrder(listOfIntegers);
        System.out.println("Sum = "+printSum(listOfIntegers));
        System.out.println("Average = "+printAverage(listOfIntegers));
    }

    public static void printListInAscOrder(List<Integer> integerList){
        System.out.print("List: ");
        ListIterator<Integer> iterator = integerList.listIterator();
        Collections.sort(integerList);

        while (iterator.hasNext()){
            System.out.printf("%d | ", iterator.next());
        }
        System.out.println();
    }

    public static int printSum(List<Integer> integerList){
        int sum = 0;
        for(int i : integerList){
            sum += i;
        }
        return sum;
    }

    public static double printAverage(List<Integer> integerList){
        return (double)printSum(integerList)/25;
    }

}
