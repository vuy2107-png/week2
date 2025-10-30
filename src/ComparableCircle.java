public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle other) {
        // So sánh theo bán kính
        if (getRadius() > other.getRadius()) return 1;
        else if (getRadius() < other.getRadius()) return -1;
        else return 0;
    }
}
