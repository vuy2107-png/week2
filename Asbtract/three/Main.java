package three;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // Tạo mảng các hình
        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Square(4.0);

        // Duyệt qua từng hình
        for (Resizeable shape : shapes) {
            double percent = 1 + random.nextInt(100); // 1-100%
            System.out.println("Tăng kích thước lên " + percent + "%");

            // In diện tích trước
            double oldArea = 0;
            if (shape instanceof Circle) {
                oldArea = ((Circle) shape).getArea();
            } else if (shape instanceof Rectangle) {
                oldArea = ((Rectangle) shape).getArea();
            }

            System.out.println("Diện tích trước: " + oldArea);

            // Resize
            shape.resize(percent);

            // In diện tích sau
            double newArea = 0;
            if (shape instanceof Circle) {
                newArea = ((Circle) shape).getArea();
            } else if (shape instanceof Rectangle) {
                newArea = ((Rectangle) shape).getArea();
            }

            System.out.println("Diện tích sau: " + newArea);
            System.out.println("-----------------------------------");
        }
    }
}
