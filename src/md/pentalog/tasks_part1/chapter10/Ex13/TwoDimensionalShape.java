package md.pentalog.tasks_part1.chapter10.Ex13;

public abstract class TwoDimensionalShape extends Shape implements TwoDimentionalIntf{
    private String shape;

    public TwoDimensionalShape(String typeShape, String shape) {
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
        return super.toString()+"\n   TwoDimensionalShape{\n" +
                "   shape='" + shape + '\'' +
                "\n   }";
    }
}
