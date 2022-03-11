package md.pentalog.tasks_part1.chapter6;

public class Ex15 {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(5.0, 4.0);
        Triangle triangle2 = new Triangle(5.0, 12.0);
        Triangle triangle3 = new Triangle(8.0, 15.0);

        System.out.println("---[ Hypotenuse calculations with methods pow and sqrt ]---");
        System.out.printf("             Hypotenuse of triangle1 = %.2f%n", triangle1.calculateHypotenuse(triangle1.getSide1(), triangle1.getSide2()));
        System.out.printf("             Hypotenuse of triangle2 = %.2f%n", triangle2.calculateHypotenuse(triangle2.getSide1(), triangle2.getSide2()));
        System.out.printf("             Hypotenuse of triangle2 = %.2f%n", triangle3.calculateHypotenuse(triangle3.getSide1(), triangle3.getSide2()));
        System.out.println("-----------------------------------------------------------\n");

        System.out.println("---[ Hypotenuse calculations with methods hypot of class Math ]---");
        System.out.printf("                 Hypotenuse of triangle1 = %.2f%n", Math.hypot(triangle1.getSide1(), triangle1.getSide2()));
        System.out.printf("                 Hypotenuse of triangle2 = %.2f%n", Math.hypot(triangle2.getSide1(), triangle2.getSide2()));
        System.out.printf("                 Hypotenuse of triangle2 = %.2f%n", Math.hypot(triangle3.getSide1(), triangle3.getSide2()));
        System.out.println("-------------------------------------------------------------------\n");

    }
}
