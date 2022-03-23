package md.pentalog.tasks_part1.chapter10.Ex13;

public abstract class ThreeDimensionalShape extends Shape implements ThreeDimensionalIntf{
    private String shape;

    public ThreeDimensionalShape(String typeShape, String shape) {
        super(typeShape);
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return super.toString()+"\n   ThreeDimnesionalShape{\n" +
                "   shape='" + shape + '\'' +
                "\n   }";
    }
}
