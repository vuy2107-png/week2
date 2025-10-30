package hai;

public class Main2 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "red");
        System.out.println(circle);
        System.out.println("Area of circle: " + circle.getArea());

        System.out.println("----------------");

        Cylinder cylinder = new Cylinder(5.0, 10.0, "blue");
        System.out.println(cylinder);
        System.out.println("Area of cylinder: " + cylinder.getArea());
        System.out.println("Volume of cylinder: " + cylinder.getVolume());
    }
}
