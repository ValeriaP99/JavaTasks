package md.pentalog.tasks_part1.chapter10.Ex13;

public class Square extends TwoDimensionalShape{
    private double side;

    public Square(String typeShape, String shape, double side) {
        super(typeShape, shape);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return super.toString()+"\n      Square{\n" +
                "side=" + side +
                "\n      }";
    }
}
