package two;

public class Main {
    public static void main(String[] args) {
        // Tạo mảng các hình có thể thay đổi kích thước
        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Square(4.0);

        // Duyệt qua từng hình, hiển thị trước và sau khi thay đổi kích thước
        for (Resizeable shape : shapes) {
            System.out.println("Trước khi thay đổi: " + shape);
            shape.resize(50); // tăng kích thước thêm 50%
            System.out.println("Sau khi thay đổi: " + shape);
            System.out.println("-------------------------");
        }
    }
}
