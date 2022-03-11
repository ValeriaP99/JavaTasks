package md.pentalog.tasks_part1.chapter6;

public class Triangle {
    private double side1;
    private double side2;

    public Triangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public static double calculateHypotenuse(double side1, double side2){
        double hypot;

        hypot = Math.sqrt( Math.pow(side1, 2) + Math.pow(side2, 2));

        return  hypot;
    }
}
