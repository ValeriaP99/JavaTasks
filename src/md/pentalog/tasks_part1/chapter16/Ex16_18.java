package md.pentalog.tasks_part1.chapter16;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Ex16_18 {
    public static void main(String[] args) {
        List<Character> characters = new LinkedList<>();
        char[] chars = {'a', 'd', 'z', 't', 'b', 'w', 'x', 'e', 'p', 's'};
        for(char c : chars){
            characters.add(c);
        }
        printList(characters);
        List<Character> characters1 = new LinkedList<>();
        characters1.addAll(characters);
        printListInReversedOrder(characters1);
    }

    public static void printList(List<Character> characters){
        ListIterator<Character> iterator = characters.listIterator();
        System.out.print("List of chars: ");
        //Collections.sort(characters);
        while (iterator.hasNext()){
            System.out.printf("%c | ", iterator.next());
        }
        System.out.println();
    }

    public static void printListInReversedOrder(List<Character> characters ){
        ListIterator<Character> iterator = characters.listIterator(characters.size());
        System.out.print("Reversed list: ");
        while(iterator.hasPrevious()){
            System.out.printf("%c | ", iterator.previous());
        }
    }


}
