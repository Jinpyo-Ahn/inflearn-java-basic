package oop1.exercise;

public class RectangleOopMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.width = 5;
        rectangle.height = 8;

        int area = rectangle.calculateArea();
        int perimeter = rectangle.calculatePerimeter();
        boolean isSquare = rectangle.isSquare();

        System.out.println("넓이는: " +area);
        System.out.println("둘레는: " + perimeter);
        System.out.println("정사각형 여부: " +isSquare);

    }
}
