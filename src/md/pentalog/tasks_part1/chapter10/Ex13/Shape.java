package md.pentalog.tasks_part1.chapter10.Ex13;

public abstract class Shape {
    private String typeShape;

    public Shape(String typeShape) {
        this.typeShape = typeShape;
    }

    public String getTypeShape() {
        return typeShape;
    }

    public void setTypeShape(String typeShape) {
        this.typeShape = typeShape;
    }

    @Override
    public String toString() {
        return "Shape{\n" +
                "typeShape='" + typeShape + '\'' +
                "\n}";
    }
}
