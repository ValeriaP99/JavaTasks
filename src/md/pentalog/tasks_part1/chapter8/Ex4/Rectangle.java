package md.pentalog.tasks_part1.chapter8.Ex4;

public class Rectangle {
    private double width = 1;
    private double length = 1;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0.0 || width > 20.0)
            throw new IllegalArgumentException("Width must be between 0.0 and 20.0");
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(width < 0.0 || width > 20.0)
            throw new IllegalArgumentException("Length must be between 0.0 and 20.0");
        this.length = length;
    }

    public double getPerimeter(double width, double length){
        return (width*2)+(length*2);
    }

    public double getArea(double width, double length){
        return width*length;
    }
}
