package md.pentalog.tasks_part1.chapter16;

import java.util.*;

public class Ex16_13 {
    public static void main(String[] args) {
        String[] names = {"John", "ELizabeth", "Zana", "John", "Mercedes", "Zana"};
        List<String> list = Arrays.asList(names);

        System.out.printf("List: %s%n", list);
        printNonDuplicate(list);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Find by first name --> ");
        String firstName = scanner.nextLine();

        if(list.contains(firstName)){
            System.out.println("This name exist!");
        }else{
            System.out.println("This name doesn't exist");
        }
    }

    private static void printNonDuplicate(Collection<String> values){
        Set<String> set = new HashSet<>(values);
        System.out.print("\nNonduplicates are: ");

        for(String value : set){
            System.out.printf("%s ", value);
        }
        System.out.println();
    }
}
