package md.pentalog.tasks_part1.chapter20.Ex20_8;

public class TestPair {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("size1", 4);
        Pair<Character, Double> pair2 = new Pair<>('H', 34.2);

        System.out.println("Pair1<String, Integer> = "+pair1.toString());
        System.out.println("Pair2<Character, Double> = "+pair2.toString());
    }

}
