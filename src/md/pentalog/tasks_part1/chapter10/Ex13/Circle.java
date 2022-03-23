package md.pentalog.tasks_part1.chapter10.Ex13;

public class Circle extends TwoDimensionalShape{
    private double radius;

    public Circle(String typeShape, String shape, double radius) {
        super(typeShape, shape);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString()+"\n      Circle{\n" +
                "      radius=" + radius +
                "\n      }";
    }
}
