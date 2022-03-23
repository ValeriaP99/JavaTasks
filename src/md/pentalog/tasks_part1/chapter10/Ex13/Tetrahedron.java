package md.pentalog.tasks_part1.chapter10.Ex13;

public class Tetrahedron extends ThreeDimensionalShape {
    private double side;

    public Tetrahedron(String typeShape, String shape, double side) {
        super(typeShape, shape);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2)*Math.sqrt(3);
    }

    @Override
    public double getVolume() {
        return (Math.pow(side, 3)*Math.sqrt(2))/12;
    }
}
