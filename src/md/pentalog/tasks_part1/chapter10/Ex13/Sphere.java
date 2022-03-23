package md.pentalog.tasks_part1.chapter10.Ex13;

public class Sphere extends ThreeDimensionalShape {

    private double radius;

    public Sphere(String typeShape, String shape, double radius) {
        super(typeShape, shape);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4*Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (4/3)*Math.PI*Math.pow(radius, 3);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString()+"\n      Sphere{\n" +
                "      radius=" + radius +
                "\n      }";
    }
}
