package nam;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    // Constructor không tham số
    public Triangle() {
        super();
    }

    // Constructor có 3 cạnh
    public Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Constructor đầy đủ (3 cạnh + thuộc tính shape)
    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Getter và Setter
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // Phương thức tính chu vi
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Phương thức tính diện tích theo công thức Heron
    public double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public String toString() {
        return "A Triangle with sides = [" + side1 + ", " + side2 + ", " + side3 +
                "], area = " + String.format("%.2f", getArea()) +
                ", perimeter = " + String.format("%.2f", getPerimeter()) +
                ", which is a subclass of " + super.toString();
    }
}
