package two;

public class Circle extends Shape implements Resizeable {
    private double radius = 1.0;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void resize(double percent) {
        radius += radius * percent / 100;
    }

    @Override
    public String toString() {
        return "Circle with radius=" + radius +
                ", which is a subclass of " + super.toString();
    }
}
