package one;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Main {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Tiger tiger = new Tiger();
        Apple apple = new Apple();
        Orange orange = new Orange();

        chicken.makeSound();
        System.out.println(chicken.howToEat());

        tiger.makeSound();

        System.out.println(apple.howToEat());
        System.out.println(orange.howToEat());
    }
}
