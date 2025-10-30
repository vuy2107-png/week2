public class Main1 {
    public static void main(String[] args) {
        Shape shape = new Shape("red", false);
        System.out.println(shape);

        Circle circle = new Circle(2.5, "blue", true);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(3.0, 4.0, "yellow", false);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());

        Square square = new Square(5.0, "purple", true);
        System.out.println(square);

        ComparableCircle c1 = new ComparableCircle(3.0);
        ComparableCircle c2 = new ComparableCircle(4.0);

        System.out.println("Compare c1 and c2: " + c1.compareTo(c2));
    }
}
