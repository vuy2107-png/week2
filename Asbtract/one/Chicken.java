package one;

public class Chicken extends Animal implements Edible{
    @Override
    public void makeSound() {
        System.out.println("Chicken: Quacc quacccccc");
    }
    @Override
    public String howToEat() {
        return "Rán lên rất ngon!";
    }
}
