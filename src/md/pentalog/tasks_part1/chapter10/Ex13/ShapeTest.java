package md.pentalog.tasks_part1.chapter10.Ex13;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        TwoDimentionalIntf twoDimentionalInt;

        shapes[0] = new Circle("TwoDimensionalShape", "Circle", 3);
        shapes[1] = new Square("TwoDimensionalShape", "Square", 3.5);
        shapes[2] = new Triangle("TwoDimensionalShape", "Triangle", 2, 4, 3);
        shapes[3] = new Sphere("ThreeDimensionalShape", "Sphere", 4.6);
        shapes[4] = new Cube("ThreeDimensionalShape", "Cube", 5);
        shapes[5] = new Tetrahedron("ThreeDimensionalShape", "Tetrahedron", 4);

        System.out.println("----------------------------------");
        for(Shape shape : shapes){
            System.out.println(shape.toString());
            if(shape instanceof TwoDimensionalShape){
                System.out.printf("Area : %.2f%n", ((TwoDimensionalShape) shape).getArea());
            }else if(shape instanceof ThreeDimensionalShape){
                System.out.printf("Area : %.2f%n", ((ThreeDimensionalShape) shape).getArea());
                System.out.printf("Volume : %.2f%n", ((ThreeDimensionalShape) shape).getVolume());
            }
            System.out.println("----------------------------------");
        }
    }
}
