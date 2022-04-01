package md.pentalog.tasks_part1.chapter20;

import java.lang.reflect.Type;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class Ex20_4 {
    public static <T extends Comparable<T>> void selectionSort(T[] data)
    {
        // loop over data.length - 1 elements
        for (int i = 0; i < data.length - 1; i++)
        {
            int smallest = i; // first index of remaining array

            // loop to find index of smallest element
            for (int index = i + 1; index < data.length; index++)
                if (data[index].compareTo(data[smallest]) < 0)
                    smallest = index;

            swap(data, i, smallest); // swap smallest element into position
            printPass(data, i + 1, smallest); // output pass of algorithm
        }
    } // end method selectionSort

    // helper method to swap values in two elements
    private static <T> void swap(T[] data, int first, int second)
    {
        T temporary = data[first]; // store first in temporary
        data[first] = data[second]; // replace first with second
        data[second] = temporary; // put temporary in second
    }

    // print a pass of the algorithm
    private static <T> void printPass(T[] data, int pass, int index)
    {
        System.out.printf("after pass %2d: ", pass);

        // output elements till selected item
        for (int i = 0; i < index; i++)
            System.out.print(data[i]+" ");

        System.out.print(data[index]+"* "); // indicate swap

        // finish outputting array
        for (int i = index + 1; i < data.length; i++)
            System.out.print(data[i]+" ");

        System.out.printf("%n               "); // for alignment

        // indicate amount of array that’s sorted
        for (int j = 0; j < pass; j++)
            System.out.print("--  ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        SecureRandom generator = new SecureRandom();
        Scanner scanner = new Scanner(System.in);
        int sizeI;
        int sizeD;
        System.out.println("Enter a list of integer and double float values");
        System.out.print("What is the size of integer list ? --> ");
        sizeI = scanner.nextInt();
        System.out.print("What is the size of float list ? --> ");
        sizeD = scanner.nextInt();

        Integer[] data = new Integer[sizeI]; // create array
        Double[] data2 = new Double[sizeD]; // create array

        System.out.println("Integer list (with Enter tab): ");
        for(int i = 0; i < data.length; i++){
            System.out.print((i+1)+". ");
            data[i] = scanner.nextInt();
        }

        System.out.println("Float list: ");
        for(int i = 0; i < data2.length; i++){
            System.out.print((i+1)+". ");
            data2[i] = scanner.nextDouble();
        }

        System.out.printf("Unsorted array:%n%s%n%n",
                Arrays.toString(data)); // display array
        selectionSort(data); // sort array

        System.out.printf("Sorted array:%n%s%n%n",
                Arrays.toString(data)); // display array


        System.out.printf("Unsorted array:%n%s%n%n",
                Arrays.toString(data2)); // display array
        selectionSort(data2); // sort array

        System.out.printf("Sorted array:%n%s%n%n",
                Arrays.toString(data2)); // display array
    }

}
