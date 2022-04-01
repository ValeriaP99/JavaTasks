package md.pentalog.tasks_part1.chapter16;

import java.util.*;

public class Ex16_14 {
    public static void main(String[] args)
    {
        // create HashMap to store String keys and Integer values
        Map<String, Integer> myMap = new HashMap<>();

        createMap(myMap); // create map based on user input
        displayMap(myMap); // display map content
    } // end main

    // create map from user input
    private static void createMap(Map<String, Integer> map)
    {
        Scanner scanner = new Scanner(System.in); // create scanner
        System.out.println("Enter a string:"); // prompt for user input
        String input = scanner.nextLine();

        // tokenize the input
        //char[] letters = input.toCharArray();
        String[] tokens = input.split(" ");

        // processing input text
        for (String token : tokens) {
            String word = token.toLowerCase(); // get lowercase word
            String[] letters = token.split("");

            for (String letter : letters) {

                // if the map contains the word
                if (map.containsKey(letter)) // is word in map
                {
                    int count = map.get(letter); // get current count
                    map.put(letter, count + 1); // increment count
                } else
                    map.put(letter, 1); // add new word with a count of 1 to map
            }
        }
    }

    // display map content
    private static void displayMap(Map<String, Integer> map)
    {
        Set<String> keys = map.keySet(); // get keys

        // sort keys
        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        // generate output for each key in map
        for (String key : sortedKeys)
            System.out.printf("%-10s%-10s%n", key, map.get(key));

        System.out.printf(
                "%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
    }
}
