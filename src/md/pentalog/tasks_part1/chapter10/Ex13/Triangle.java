package md.pentalog.tasks_part1.chapter10.Ex13;

public class Triangle extends TwoDimensionalShape{

    private double side1;
    private double side2;
    private double side3;

    public Triangle(String typeShape, String shape, double side1, double side2, double side3) {
        super(typeShape, shape);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double semiP = (side1 + side2 + side2)/2;
        return Math.sqrt(semiP*(semiP - side1)*(semiP - side2)*(semiP - side3));
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return super.toString()+"\n      Triangle{\n" +
                "      side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                "\n      }";
    }
}
