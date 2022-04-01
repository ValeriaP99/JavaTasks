package md.pentalog.tasks_part1.chapter20;

public class Ex20_5 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};

        try {
            System.out.println("Elements of intArray between index 1 and 3");
            printArray(intArray, 1, 3);
            System.out.println("Elements of doubleArray between index 2 and 5");
            printArray(doubleArray, 2, 5);
            System.out.println("Elements of charArray between index 2 and 8");
            printArray(charArray, 2, 8);
        } catch (InvalidSubscriptException e) {
            e.printStackTrace();
        }

    }

    public static <T> void printArray(T[] array, int lowSubscript, int highSubscript) throws InvalidSubscriptException {
        if(lowSubscript > array.length && highSubscript > array.length){
            throw new InvalidSubscriptException("LowSubscript or HighSubscript are out of range");
        }
        for(int i = lowSubscript-1; i < highSubscript; i++){
            System.out.printf("%s ", array[i]);
        }
        System.out.println();
    }
}
