package md.pentalog.tasks_part1.chapter8.Ex4;

import md.pentalog.tasks_part1.chapter7.Ex21;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        double length = rectangle.getLength();
        double width = rectangle.getWidth();
        System.out.println("\nRectangle with default value");
        getAreaAndPerimeter(rectangle, width, length);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data about rectangle");
        System.out.print("Width = ");
        width = scanner.nextDouble();
        System.out.print("Length = ");
        length = scanner.nextDouble();
        rectangle.setWidth(width);
        rectangle.setLength(length);
        getAreaAndPerimeter(rectangle, width, length);
    }

    public static void getAreaAndPerimeter(Rectangle rectangle, double length, double width){
        System.out.println("<----[ Rectangle ]---->");
        Ex21.drawBorderLine(23, '-');
        System.out.printf("|%-10s|%-10s|%n", "Perimeter", "Area");
        Ex21.drawBorderLine(23, '-');
        System.out.printf("|%-10.2f|%-10.2f|%n", rectangle.getPerimeter(width, length),
                rectangle.getArea(width, length));
        Ex21.drawBorderLine(23, '-');
        System.out.println();
    }
}
