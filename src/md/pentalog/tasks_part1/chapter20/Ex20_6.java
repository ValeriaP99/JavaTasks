package md.pentalog.tasks_part1.chapter20;

public class Ex20_6 {
    public static void main(String[] args)
    {
        // create arrays of Integer, Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"one", "two", "three", "four", "five", "six", "seven", "eight"};

        System.out.print("Array integerArray contains:%n");
        printArray(integerArray); // pass an Integer array
        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray); // pass a Double array
        System.out.printf("%nArray characterArray contains:%n");
        printArray(characterArray); // pass a Character array
        System.out.printf("%nArray stringArray contains:%n");
        System.out.println("Generic method: ");
        printArray(stringArray);
        System.out.println("String method: ");
        printArray(stringArray);
    }

    // generic method printArray
    public static <T> void printArray(T[] inputArray)
    {
        // display array elements
        for (T element : inputArray)
            System.out.printf("%s ", element);

        System.out.println();
    }

    public static void printArray(String stringArray){
        for(int i = 0; i < stringArray.length(); i++){
            System.out.printf("%s   ");
            if(i == 3){
                System.out.println();
            }
        }
    }
}
