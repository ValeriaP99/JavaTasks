package md.pentalog.tasks_part1.chapter10.Ex13;

public class Cube extends ThreeDimensionalShape {
    private double side;

    public Cube(String typeShape, String shape, double side) {
        super(typeShape, shape);
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6*Math.pow(side, 2);
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return super.toString()+"\n      Cube{\n" +
                "      side=" + side +
                "\n      }";
    }
}
