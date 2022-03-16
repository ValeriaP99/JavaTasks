package md.pentalog.tasks_part1.chapter7;

public class Ex15 {
    public static void main(String[] args) {
        int arrayLength;
        if(args.length != 1){
            System.out.println("By default array length is 10 ");
            arrayLength = 10;
            sumOfInteger(arrayLength);
        }else{
            arrayLength = Integer.parseInt(args[0]);
            sumOfInteger(arrayLength);
        }
    }

    public static int sumOfInteger(int length){
        int[] intArray = new int[length];
        int sum = 0;
        System.out.println("-----------------------");
        System.out.printf("|%-10s|%-10s|%n", "Index", "Sum");
        System.out.println("-----------------------");
        for(int i = 0; i < intArray.length; i++){
            sum += i;
            System.out.printf("|%-10d|%-10d|%n", (i+1), sum);
        }
        System.out.println("-----------------------");
        return sum;
    }
}
