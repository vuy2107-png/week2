package bon;

public class Main {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(2, 3, 0.5f, 1.5f);
        System.out.println("Trước khi di chuyển: " + mp);

        mp.move();
        System.out.println("Sau khi di chuyển: " + mp);
    }
}
